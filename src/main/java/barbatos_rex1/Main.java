package barbatos_rex1;

import barbatos_rex1.domain.DataSheet;
import barbatos_rex1.domain.Item;
import barbatos_rex1.domain.Product;
import barbatos_rex1.domain.Year;
import barbatos_rex1.io.Importer;
import barbatos_rex1.io.DataSheetImporter;

import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Importer i = new DataSheetImporter();
        DataSheet sheet = i.importFile("D:\\Java\\ESINF Project 1\\src\\main\\resources\\csv\\FAOSTAT_data_en_9-7-2022_BIG.csv");
        System.out.println(sheet);
        EX2 ex2 = new EX2(sheet);
        List<String> countries = ex2.listContriesThatProducedItemByQuantity(new Item(5510,"Production",515,"Apples"),3000000);
        System.out.println(countries);
        System.out.println(new EX3(sheet).findMinNumberOfAreasThatTogetherSurpassIn(50000000,new Year(2010,2010)));
    }
}