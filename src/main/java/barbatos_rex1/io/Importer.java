package barbatos_rex1.io;

import barbatos_rex1.domain.DataSheet;

import java.io.FileNotFoundException;

public interface Importer {

    DataSheet importFile(String filePath) throws FileNotFoundException;

}
