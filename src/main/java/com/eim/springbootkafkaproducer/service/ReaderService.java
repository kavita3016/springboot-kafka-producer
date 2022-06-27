package com.eim.springbootkafkaproducer.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.eim.springbootkafkaproducer.model.Sales;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

@Service
public class ReaderService {

    public List<Sales> publishSales() {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        List<Sales> sales = new ArrayList<>();

        try (FileReader reader = new FileReader("sales_data.json")) {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONObject obj1 = (JSONObject) obj;
            JSONArray salesList = (JSONArray) obj1.get("sales");


            salesList.forEach(sale -> sales.add(parseSalesObject((JSONObject) sale)));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return sales;
    }

    private static Sales parseSalesObject(JSONObject sale) {
        Sales sales;
        if (sale.get("adjustmentOperation") != null) {
            sales = new Sales().builder()
                    .product((String) sale.get("product"))
                    .adjustmentOperation((String) sale.get("adjustmentOperation"))
                    .adjustmentPrice((Double)sale.get("adjustmentPrice"))
                    .build();
        } else {
            sales = new Sales().builder()
                    .product((String) sale.get("product"))
                    .price((Double) sale.get("price"))
                    .quantity(((Long) sale.get("quantity")).intValue())
                    .build();
        }
        return sales;
    }
}
