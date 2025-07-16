package main.burumable.utils;

import java.util.Optional;

/**
 * [OptionalParser<T>]
 *
 * 이 인터페이스는 Optional<T> 객체를 안전하게 확정 타입 T로 변환(parse)하기 위한 전략 인터페이스입니다.
 *
 * ✅ 사용 목적:
 * - Optional 객체 내부의 값을 안전하게 꺼내고 (null-safe)
 * - 호출자 입장에서 명확하게 확정된 값을 전달받도록 설계했습니다.
 *
 * ✅ 사용 시 유의사항:
 * - 기본 구현체(DefaultParser)는 값이 없을 경우 NoSuchElementException을 발생시킵니다.
 * - 이후 필요에 따라 기본값 반환 전략(FallbackParser), DTO 변환 전략(DtoParser) 등으로 확장 가능합니다.
 *
 * ✅ 예시:
 * Member member = new DefaultParser<Member>().parse(optionalMember);
 *
 * @param <T> Optional에 포함된 실제 객체 타입
 */
public interface OptionalParser<T> {
    /**
     * Optional<T> 객체를 파싱하여 확정된 T 객체로 변환합니다.
     * 예외 처리나 기본값 제공은 구현체에서 정의합니다.
     *
     * @param optional 파싱 대상 Optional 객체
     * @return 확정된 결과 객체
     */
    T parse(Optional<T> optional);
}