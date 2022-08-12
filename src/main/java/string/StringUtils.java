package string;

public class StringUtils {

    /**
     * Данный метод находит саммую длинную строку в массиве и возвращает объект представленный из
     * размера данной строки и её значении
     * @param strings массив строк
     * @return самая большая строка в верхнем регистреxn
     */
    public static BigString getTheBiggestStringFromArray(String[] strings) {

        if(strings == null || strings.length == 0) {
            return null;
        }

        String maxStroka = "";
        int maxLengthStroka = 0;
        for (String string : strings) {
            if (string.length() > maxLengthStroka) {
                maxLengthStroka = string.length();
                maxStroka = string;
            }
        }
        return new BigString(maxLengthStroka, maxStroka);
    }
}
