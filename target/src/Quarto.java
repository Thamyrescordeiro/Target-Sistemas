/*Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

SP – R$67.836,43
RJ – R$36.678,66
MG – R$29.229,88
ES – R$27.165,48
Outros – R$19.849,53*/


import java.util.HashMap;
import java.util.Map;

public class Quarto {

        public static void main(String[] args) {


            Map<String, Double> faturamentoPorEstado = new HashMap<>();
            faturamentoPorEstado.put("SP", 67836.43);
            faturamentoPorEstado.put("RJ", 36678.66);
            faturamentoPorEstado.put("MG", 29229.88);
            faturamentoPorEstado.put("ES", 27165.48);
            faturamentoPorEstado.put("Outros", 19849.53);


            double faturamentoTotal = 0;
            for (double faturamento : faturamentoPorEstado.values()) {
                faturamentoTotal += faturamento;
            }

            System.out.println("Percentual de representação por estado:");
            for (Map.Entry<String, Double> entry : faturamentoPorEstado.entrySet()) {
                String estado = entry.getKey();
                double faturamento = entry.getValue();
                double percentual = (faturamento / faturamentoTotal) * 100;
                System.out.println(estado + ": " + percentual + "%");
            }
        }

    }


