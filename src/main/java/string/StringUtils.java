package string;

public class StringUtils {

    public String[] getMassvStrok() {
        return massvStrok;
    }

    public void setMassvStrok(String[] massvStrok) {
        this.massvStrok = massvStrok;
    }

    String[] massvStrok = new String[4];
    String[] massivStrok = {"winter", "spring", "autumn0", "summer"};
    /**
     * Данный метод находит саммую длинную строку в массиве и возвращает объект представленный из
     * размера данной строки и её значении
     * @param strings массив строк
     * @return самая большая строка в верхнем регистре
     */
    public static BigString getTheBiggestStringFromArray(String[] strings) {

        String[] massivStrok = new String[4];

        String maxStroka;
        int maxLengthStroka = 0;
        for (int i =0; i < massivStrok.length; i++) {
            if (massivStrok[i].length() > massivStrok[i+1].length()) {
                maxLengthStroka = massivStrok[i].length();
                //maxStroka = maxLengthStroka;
            }
        }
        System.out.println(maxLengthStroka + massivStrok.length);
        return null;
    }
}
