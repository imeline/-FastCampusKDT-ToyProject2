package com.travel.domain.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeUtil {

    // 날짜와 시간을 문자열로 변환할 때 사용되는 형식을 정의
    // 아래의 toString, LocalDateTime 에서 사용
    public final static String LOCALDATETIME_PATTERN = "yyyy-MM-dd HH:mm";

    // 날짜와 시간을 나타내는 문자열의 형식을 검증하는데 사용
    // '년{4자리 수 숫자} - 월{1-9는 0으로 사작, 10-12는 1로 시작] - 일{1-9는 0으로, 10-29는 0 or 1로, 30-31은 3으로 시작} 시{1-9는 0으로, 10-19는 1로, 20-24는 2로 시작} : 분{1-9는 0으로, 10-59는 1~5로 시작}'
    public final static String LOCALDATETIME_VALIDATION = "\\d{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01]) (0[1-9]|1[0-9]|2[0-4]):(0[1-9]|[1-5][0-9])";

    // LocalDateTime 객체를 받아들여 LOCALDATETIME_PATTERN에 맞게 문자열로 변환 - DB 데이터를 지정한 형식의 문자열로 바꿈
    public static String LocalDateTimeToString(LocalDateTime dateTimeObject) {
        return dateTimeObject.format(DateTimeFormatter.ofPattern(LOCALDATETIME_PATTERN));
    }

    // 문자열을 받아들여 LocalDateTime으로 변환 - 사용자 입력을 DB 헝식에 맞게 바꿈
    public static LocalDateTime StringToLocalDateTime(String datetimeString) {
        return LocalDateTime.parse(datetimeString, DateTimeFormatter.ofPattern(LOCALDATETIME_PATTERN));
    }

}