package com.example.calendarapp.reader;

import com.opencsv.CSVReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class RawCsvReader {

    public List<String[]> readAll(String path) throws IOException {
        InputStream in = getClass().getResourceAsStream(path);
        assert in != null;
        InputStreamReader reader = new InputStreamReader(in, StandardCharsets.UTF_8);
        CSVReader strings = new CSVReader(reader);
        return strings.readAll();
    }
}
