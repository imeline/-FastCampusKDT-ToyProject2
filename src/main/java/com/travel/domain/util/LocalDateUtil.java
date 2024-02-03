package com.travel.domain.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateUtil {
    // 날짜를 문자열로 변환할 때 사용되는 형식을 정의
    // 아래 두 함수에서 사용
    public final static String LOCALDATE_PATTERN = "yyyy-MM-dd";

    // 날짜를 나타내는 문자열의 형식을 검증하는데 사용
    // '년{4자리 숫자} - 월{1-9는 0으로 사작, 10-12는 1로 시작] - 일{1-9는 0으로, 10-29는 0 or 1로, 30-31은 3으로 시작}'
    public final static String LOCALDATE_VALIDATION = "\\d{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])";

    public static String LocalDateToString(LocalDate dateObject) {
        return dateObject.format(DateTimeFormatter.ofPattern(LOCALDATE_PATTERN));
    }

    public static LocalDate StringToLocalDate(String dateString) {
        return LocalDate.parse(dateString, DateTimeFormatter.ofPattern(LOCALDATE_PATTERN));
    }
}
