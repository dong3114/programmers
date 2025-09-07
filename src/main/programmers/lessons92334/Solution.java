package main.programmers.lessons92334;

import java.util.*;

/**
 * 문제 소개:
 * 신입사원 무지는 게시판 불량 이용자를 신고하고 처리 결과를 메일로 발송하는 시스템을 개발하려 합니다.
 * 무지가 개발하려는 시스템은 다음과 같습니다.
 * 시스템 소개:
 * 각 유저는 한 번에 한 명의 유저를 신고할 수 있습니다.
 * 신고 횟수에 제한은 없습니다. 서로 다른 유저를 계속해서 신고할 수 있습니다.
 * 한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
 * k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
 * 유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다
 */
public class Solution {
    public ArrayList<Integer> solution(String[] id_list, String[] report, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        // 1. Set사용 필터링
        Set<String> filterUsers = new HashSet<>();
        for(String r : report) filterUsers.add(r);
        // 2. 필터링 된 유저 목록 배열로 변환
        ArrayList<String[]> reportUsers = new ArrayList<>();
        for(String r : filterUsers) reportUsers.add(reportUser(r));
        // 3. 각 배열에 존재하는 0번 인덱스가 신고 당한 횟수 key, value
        Map<String,Integer> reportedCount = new HashMap<>();
        for(String id : id_list) reportedCount.put(id, 0);    // 초기 셋팅
        for(String[] pair : reportUsers) {
            String target = pair[1];
            reportedCount.put(target, reportedCount.get(target)+1);
        }
        // 3-1. 정지 대상 반환
        Set<String> s_user = new HashSet<>();
        for(String id : id_list) if(reportedCount.get(id) >= k) s_user.add(id);
        // 4. 신고자 인덱스
        Map<String, Set<String>> report_target = new HashMap<>();
        for (String id : id_list) report_target.put(id, new HashSet<>());
        // 4-1. 타겟에 대한 모든 신고자를 넣기
        for (String[] pair : reportUsers) {
            String reporter = pair[0];
            String target = pair[1];
            report_target.get(target).add(reporter);
        }
        // 최종 메일 카운팅
        Map<String, Integer> mailCount = new HashMap<>();
        for (String id : id_list) mailCount.put(id, 0);
        for (String id: s_user) {
            for (String r : report_target.getOrDefault(id, Collections.emptySet())) {
                mailCount.put(r, mailCount.get(r) + 1);
            }
        }
        for(String id : id_list) answer.add(mailCount.get(id));
        return answer;
    }

    private String[] reportUser(String report) {
        return report.split("\\s+");
    }
}
