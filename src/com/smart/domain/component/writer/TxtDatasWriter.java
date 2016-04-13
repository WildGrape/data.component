package com.smart.domain.component.writer;

import com.smart.enhance.platfarm.exception.CommException;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.StringTokenizer;


/**
 * Created by Administrator on 2016/4/14.
 */
public class TxtDatasWriter implements DatasWriter {
    private static final TxtDatasWriter INST = new TxtDatasWriter();

    private String valueSepator = ",";


    public static TxtDatasWriter instance() {
        return INST;
    }


    public void writeDatas(String outFile, List<List<String>> datas, List<String> title ) throws CommException {



        inputCheck(outFile, datas, title);

        OutputStreamWriter writer = null;

        try {
            writer = new OutputStreamWriter(new FileOutputStream(outFile));
            writeTitle(writer, title);
            writeDatas(writer, datas);

        } catch (FileNotFoundException e) {
            throw new CommException("write datas failed.", e);
        }catch (IOException e) {
            throw new CommException("write datas failed.", e);
        }finally {
            close(writer);
        }


    }

    private void inputCheck(String outFile, List<List<String>> datas, List<String> title) throws CommException {
        if (outFile == null) {
            throw new CommException("input file is null.");
        }
        if (datas == null) {
            throw new CommException("input datas is null.");
        }
        if (title == null) {
            throw new CommException("input title is null.");
        }
    }

    private void close(OutputStreamWriter writer) {
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException e) {
                writer = null;
            }
        }
    }


    private void writeTitle(OutputStreamWriter writer, List<String> title )throws IOException {
        writeLine(writer, title);
    }

    private void writeLine(OutputStreamWriter writer, List<String> values) throws IOException {
        for (String val : values) {
            writer.write(val);
            writer.write(valueSepator);
        }
        writer.write(System.lineSeparator());
    }

    private void writeDatas( OutputStreamWriter writer, List<List<String>> datas)throws IOException {
        for (List<String> data : datas) {
            writeLine(writer,data);
        }
    }


}
