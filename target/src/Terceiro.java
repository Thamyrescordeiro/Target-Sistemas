/*Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

  IMPORTANTE:
   a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
   b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;*/


import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

    public class Terceiro {

        public static void main(String[] args) {
            JSONParser parser = new JSONParser();

            try {
                // Carrega os dados de faturamento diário do arquivo JSON
                Object obj = parser.parse(new FileReader("faturamento.json"));
                JSONArray faturamentoDiario = (JSONArray) obj;

                // Remove os dias sem faturamento (finais de semana e feriados)
                JSONArray faturamentoDiarioSemZeros = new JSONArray();
                for (Object f : faturamentoDiario) {
                    if ((double) f > 0) {
                        faturamentoDiarioSemZeros.add(f);
                    }
                }

                // Calcula o menor e maior valor de faturamento
                double menorValor = (double) faturamentoDiarioSemZeros.get(0);
                double maiorValor = (double) faturamentoDiarioSemZeros.get(0);
                for (Object f : faturamentoDiarioSemZeros) {
                    double valor = (double) f;
                    if (valor < menorValor) {
                        menorValor = valor;
                    }
                    if (valor > maiorValor) {
                        maiorValor = valor;
                    }
                }

                // Calcula a média mensal de faturamento
                double media = 0;
                for (Object f : faturamentoDiarioSemZeros) {
                    media += (double) f;
                }
                media /= faturamentoDiarioSemZeros.size();


                int diasAcimaDaMedia = 0;
                for (Object f : faturamentoDiarioSemZeros) {
                    double valor = (double) f;
                    if (valor > media) {
                        diasAcimaDaMedia++;
                    }
                }

                System.out.println("Menor valor de faturamento: " + menorValor);
                System.out.println("Maior valor de faturamento: " + maiorValor);
                System.out.println("Número de dias acima da média: " + diasAcimaDaMedia);
            } catch (IOException | ParseException e) {
                e.printStackTrace();
            }
        }

    }

}
