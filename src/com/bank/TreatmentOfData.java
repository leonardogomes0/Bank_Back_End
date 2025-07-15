package com.bank;


public class TreatmentOfData {

    public String formatedCPF(String cpf){

        String cleanCPF = cpf.replaceAll("\\D", "");

        if (cleanCPF.length() != 11){
            return "CPF inválido";
        }
        return cleanCPF.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d{2})",
                                "$1.$2.$3-$4");
    }

    public static String formatCellphone(String phone){

        String cleanCellphone = phone.replaceAll("\\D", "");

        if (cleanCellphone.length() == 11){
            return cleanCellphone.replaceFirst("(\\d{2})(\\d{5})(\\d{4})",
                                                "($1) $2-$3");

        } else if (cleanCellphone.length() == 10) {
            return cleanCellphone.replaceFirst("(\\d{2})(\\d{4})(\\d{4})",
                                                "($1) $2-$3");
        } else {
            return "Número inválido";
        }
    }
}
