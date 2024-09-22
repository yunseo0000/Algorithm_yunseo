def solution(numbers):    
    #문자열 초기화 -> 문자열 형태로 이어붙이기
    #문자열형태를 정수 형태로 바꾸기 -> 내림차순 or 오름차순 정렬하기
    #제일 뒤 or 제일 앞 인덱스 출력.
    #순서 바꿔서 경우의 수 대로 어떻게 조합 할것인지?
    
    # 숫자 배열을 문자열로 변환
    numbers = list(map(str, numbers))
    
    # 두 문자열을 붙인 결과를 기준으로 정렬
    numbers.sort(key=lambda x: x*3, reverse=True)
    
    # 정렬된 배열을 이어 붙임
    result = ''.join(numbers)
    
    # 모든 값이 '0'일 때는 '0'을 리턴
    #00 인 경우
    return '0' if result[0] == '0' else result


    

