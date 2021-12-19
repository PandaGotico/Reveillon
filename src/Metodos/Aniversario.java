package Metodos;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aniversario {

    private static final List<String> MES_JANEIRO = List.of("JANEIRO", "JAN", "1", "01");
    private static final List<String> MES_FEVEREIRO = List.of("FEVEREIRO", "FEV", "2", "02");
    private static final List<String> MES_MARCO = List.of("MARÇO", "MARCO", "MAR", "3", "03");
    private static final List<String> MES_ABRIL = List.of("ABRIL", "ABR", "4", "04");
    private static final List<String> MES_MAIO = List.of("MAIO", "MAI", "5", "05");
    private static final List<String> MES_JUNHO = List.of("JUNHO", "JUN", "6", "06");
    private static final List<String> MES_JULHO = List.of("JULHO", "JUL", "7", "07");
    private static final List<String> MES_AGOSTO = List.of("AGOSTO", "AGO", "8", "08");
    private static final List<String> MES_SETEMBRO = List.of("SETEMBRO", "SET", "9", "09");
    private static final List<String> MES_OUTUBRO = List.of("OUTUBRO", "OUT", "10");
    private static final List<String> MES_NOVEMBRO = List.of("NOVEMBRO", "NOV", "11");
    private static final List<String> MES_DEZEMBRO = List.of("DEZEMBRO", "DEZ", "12");
    private static final List<String> MES_30 = List.of("4","6","9","11");

    public void aniversario(){
        Scanner scan = new Scanner(System.in);

        int dia, outroDia;
        int mes = 0;
        int outroMes = 0;
        int ano, outroAno;
        int diasRestantes = 365;
        int diferencaDiaMes = 0;
        int diaMes = 0;
        int diaOutroMes = 0;
        int difAno = 0;

        String mesEscrito, outroMesEscrito;

            System.out.println("informe o dia de hoje: ");
            dia = scan.nextInt();

            System.out.println("informe o mês: ");
            mesEscrito = scan.next().toUpperCase(Locale.ROOT);

            System.out.println("informe o ano: ");
            ano = scan.nextInt();

            System.out.println("informe o próximo dia: ");
            outroDia = scan.nextInt();

            System.out.println("informe o próximo  mês: ");
            outroMesEscrito = scan.next().toUpperCase(Locale.ROOT);

            System.out.println("informe o próximo ano: ");
            outroAno = scan.nextInt();

            if (MES_JANEIRO.contains(mesEscrito)) {
                diaMes = 0;
                mes = 1;

            } else if (MES_FEVEREIRO.contains(mesEscrito)) {
                diaMes = 31;
                diasRestantes = (365 - 31);
                mes = 2;

            } else if (MES_MARCO.contains(mesEscrito)) {
                diaMes = 59;
                diasRestantes = (365 - 59);
                mes = 3;

            } else if (MES_ABRIL.contains(mesEscrito)) {
                diaMes = 90;
                diasRestantes = (365 - 90);
                mes = 4;

            } else if (MES_MAIO.contains(mesEscrito)) {
                diaMes = 120;
                diasRestantes = (365 - 120);
                mes = 5;

            } else if (MES_JUNHO.contains(mesEscrito)) {
                diaMes = 151;
                diasRestantes = (365 - 151);
                mes = 6;

            } else if (MES_JULHO.contains(mesEscrito)) {
                diaMes= 181;
                diasRestantes = (365 - 181);
                mes = 7;

            } else if (MES_AGOSTO.contains(mesEscrito)) {
                diaMes = 211;
                diasRestantes = (365 - 211);
                mes = 8;

            } else if (MES_SETEMBRO.contains(mesEscrito)) {
                diaMes = 242;
                diasRestantes = (365 - 242);
                mes = 9;

            } else if (MES_OUTUBRO.contains(mesEscrito)) {
                diaMes = 272;
                diasRestantes = (365 - 272);
                mes = 10;

            } else if (MES_NOVEMBRO.contains(mesEscrito)) {
                diaMes = 303;
                diasRestantes = (365 - 303);
                mes = 11;

            } else if (MES_DEZEMBRO.contains(mesEscrito)) {
                diaMes = 333;
                diasRestantes = (365 - 333);
                mes = 12;

            } else {
                System.out.println("Erro no valor do mês");
            }
            if (MES_JANEIRO.contains(outroMesEscrito)) {
                diaOutroMes = 0;
                outroMes = 1;

            } else if (MES_FEVEREIRO.contains(outroMesEscrito)) {
                diaOutroMes = 31;
                outroMes = 2;

            } else if (MES_MARCO.contains(outroMesEscrito)) {
                diaOutroMes = 59;
                outroMes = 3;

            } else if (MES_ABRIL.contains(outroMesEscrito)) {
                diaOutroMes = 90;
                outroMes = 4;

            } else if (MES_MAIO.contains(outroMesEscrito)) {
                diaOutroMes = 120;
                outroMes = 5;

            } else if (MES_JUNHO.contains(outroMesEscrito)) {
                diaOutroMes = 151;
                outroMes = 6;

            } else if (MES_JULHO.contains(outroMesEscrito)) {
                diaOutroMes = 181;
                outroMes = 7;

            } else if (MES_AGOSTO.contains(outroMesEscrito)) {
                diaOutroMes = 211;
                outroMes = 8;

            } else if (MES_SETEMBRO.contains(outroMesEscrito)) {
                diaOutroMes = 242;
                outroMes = 9;

            } else if (MES_OUTUBRO.contains(outroMesEscrito)) {
                diaOutroMes = 272;
                outroMes = 10;

            } else if (MES_NOVEMBRO.contains(outroMesEscrito)) {
                diaOutroMes = 303;
                outroMes = 11;

            } else if (MES_DEZEMBRO.contains(outroMesEscrito)) {
                diaOutroMes = 333;
                outroMes = 12;

            } else {
                System.out.println("Erro no valor do mês");
            }

            if(outroAno < ano) {
                System.err.println("Valor invalido");

            } else if (ano == outroAno) {
                diferencaDiaMes = ((outroDia + diaOutroMes) - (dia + diaMes));

                if(outroMes < mes) {
                    System.err.println("valor invalido");
                } else if (mes <= 2) {
                    if (dia > 31) {
                        System.err.println("Data invalida!");

                    } else if (mes == 2 && dia == 29) {
                        System.out.println("hoje é dia " + dia + "/" + mes);
                        System.out.println("Faltam apenas " + (diferencaDiaMes + 1) + " a data selecionada.");

                    } else if (mes == 2 && dia >= 28 || dia <= 0) {
                        System.err.println("Data invalida!");

                    } else if (MES_30.contains(mes) && dia <= 0 || dia > 30) {
                        System.err.println("Data invalida!");

                    } else {
                        System.out.println("Hoje é dia " + dia + "/" + mes);
                        System.out.println("Faltam apenas " + (diferencaDiaMes) + " a data selecionada.");
                        System.out.println("Se o ano for bisexto " + (diferencaDiaMes + 1) + ". :) ");
                    }
                } else {
                    if (dia > 31) {
                        System.err.println("Data invalida!");

                    } else if (MES_30.contains(mes) && dia <= 0 || dia > 30) {
                        System.err.println("Data invalida!");

                    } else {
                        System.out.println("Hoje é dia " + dia + "/" + mes);
                        System.out.println("Faltam apenas " + (diferencaDiaMes) + " a data selecionada.");
                    }
                }
            } else if (outroAno > ano) {
                difAno = (((outroAno - ano) -1) * 365);
                diferencaDiaMes = ((diasRestantes - dia) + (diaOutroMes + outroDia) + difAno);

                if (mes <= 2) {
                    if (dia > 31) {
                        System.err.println("Data invalida!");

                    } else if (mes == 2 && dia == 29) {
                        System.out.println("hoje é dia " + dia + "/" + mes);
                        System.out.println("Faltam apenas " + (diferencaDiaMes + 1) + " a data selecionada.");

                    } else if (mes == 2 && dia >= 28 || dia <= 0) {
                        System.err.println("Data invalida!");

                    } else if (MES_30.contains(mes) && dia <= 0 || dia > 30) {
                        System.err.println("Data invalida!");

                    } else {
                        System.out.println("Hoje é dia " + dia + "/" + mes);
                        System.out.println("Faltam apenas " + (diferencaDiaMes) + " a data selecionada.");
                        System.out.println("Se o ano for bisexto " + (diferencaDiaMes + 1) + ". :) ");
                    }
                } else if(outroMes > 2){
                    System.out.println("Hoje é dia " + dia + "/" + mes);
                    System.out.println("Faltam apenas " + (diferencaDiaMes) + " a data selecionada.");
                    System.out.println("Se o ano for bisexto " + (diferencaDiaMes + 1) + ". :) ");
                } else {
                    if (dia > 31) {
                        System.err.println("Data invalida!");

                    } else if (MES_30.contains(mes) && dia <= 0 || dia > 30) {
                        System.err.println("Data invalida!");

                    } else {
                        System.out.println("Faltam apenas " + (diferencaDiaMes) + " a data selecionada.");
                    }
                }
            } else
                System.err.println("Valor invalido");
        }
    }

