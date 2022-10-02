package barbatos_rex1.io;

import barbatos_rex1.domain.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DataSheetImporter implements Importer {
    @Override
    public DataSheet importFile(String filePath) throws FileNotFoundException {

        Scanner sc = new Scanner(new File(filePath));
        DataSheet dataSheet = new DataSheet();

        int nLine = 1;
        while (sc.hasNextLine()) {

            try {
                String[] line = sc.nextLine().split("\",\"");
                if (nLine == 1) {
                    nLine++;
                    continue;
                }
                Area a = new Area(line[0], line[1], Integer.parseInt(line[2]), line[3]);
                Item i = new Item(Integer.parseInt(line[4]), line[5], Integer.parseInt(line[6]), line[7]);
                Year y = new Year(Integer.parseInt(line[8]), Integer.parseInt(line[9]));
                if (line[11].isEmpty()){
                    line[11]="-1";
                }
                Value v = new Value(line[10], Integer.parseInt(line[11]), line[12], line[13]);

                Product p = new Product(a, i, y, v);

                dataSheet.addProduct(p);
            } catch (Exception e) {
                System.out.println(String.format("There was an error in line: %d due to %s.", nLine, e.getCause()));
            }

            nLine++;
        }
        return dataSheet;
    }
}
