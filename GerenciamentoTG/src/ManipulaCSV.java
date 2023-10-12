import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class ManipulaCSV {

    public static void main(String[] args) throws CsvValidationException {
        String arquivoCSV = "Documentos\\trabalhodeGraduacao-202302.csv";

        try {
            // Lê o arquivo CSV
            FileReader fileReader = new FileReader(arquivoCSV);
            CSVReader csvReader = new CSVReader(fileReader);

            String[] linha;
            while ((linha = csvReader.readNext())!= null) {
                for (String valor : linha) {
                    System.out.println(valor + "");
                }
                System.out.println(); //adiciona uma quebra de linha apos cada linha do csv
            }
            fileReader.close();
            csvReader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
            // List<String[]> registros;
    }
}
//             try {
//                 registros = csvReader.readAll();

//             // Modifica os dados (exemplo: incrementa um número)
//             for (String[] registro : registros) {
//                 String valorAntigo = registro[0];
//                 int novoValor = Integer.parseInt(valorAntigo) + 1;
//                 registro[0] = String.valueOf(novoValor);
//             }

//             fileReader.close();

//             // Escreve os dados modificados de volta no arquivo CSV
//             FileWriter fileWriter = new FileWriter(arquivoCSV);
//             CSVWriter csvWriter = new CSVWriter(fileWriter);
//             csvWriter.writeAll(registros);

//             fileWriter.flush();
//             fileWriter.close();

//             System.out.println("Arquivo CSV modificado com sucesso.");

//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }