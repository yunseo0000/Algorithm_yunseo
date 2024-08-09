def solution(answers):
    # 수포자들의 찍는 패턴 배열 정의
    pattern1 = [1, 2, 3, 4, 5]
    pattern2 = [2, 1, 2, 3, 2, 4, 2, 5]
    pattern3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

    # 각 수포자들의 점수
    score = [0, 0, 0]

    # 정답과 비교
    for i in range(len(answers)):
        if answers[i] == pattern1[i % len(pattern1)]:
            score[0] += 1
        if answers[i] == pattern2[i % len(pattern2)]:
            score[1] += 1
        if answers[i] == pattern3[i % len(pattern3)]:
            score[2] += 1

    # 가장 높은 점수를 찾기
    max_score = max(score)

    # 가장 높은 점수를 받은 수포자(들)의 번호를 반환
    result = []
    for i in range(len(score)):
        if score[i] == max_score:
            result.append(i + 1)  # 수포자 번호는 1번부터 시작하므로 i+1

    return result
