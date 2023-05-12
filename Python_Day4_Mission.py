#!/usr/bin/env python
# coding: utf-8

# In[11]:


#Missoin_1.  구구단프로그램을 작성해주세요. 단을 입력하면 입력받은 단까지 모두 출력해주세요.
dan = int(input('단을 입력해보아라: '))
for a in range(1,dan+1): 
    print(f'****{a}단****') #데코레이션
    for i in range(1,10): #1~9까지
        output = a*i 
        print(f"{a}x{i}={output}")
    print('\n') #데코레이션


# In[14]:


#Missoin_2.  20개의 정수를 입력 받아서 짝수와 홀수를 구분하여 저장해주세요. 
#           저장된 수의 총합이 얼마인지와 짝수의 합이 큰지 홀수의 합이 큰지를 알려주는 코드를 작성해주세요 
#리스트 만들기
odd = []
even = []
for i in range(20):
    a = int(input(f'{i+1}번째 정수 입력: '))
    if a % 2 ==0:   #짝수일때
        even.append(a)
    else: #홀수일때
        odd.append(a)
if sum(even) > sum(odd):
    print(f'홀수의 합:{sum(odd)} 짝수의 합:{sum(even)}. 짝수의 합이 더 크다')
else:
    print(f'홀수의 합:{sum(odd)} 짝수의 합:{sum(even)}. 홀수의 합이 더 크다')    


# In[15]:


#Mission_3. 오늘의 기분을 입력받아서 입력한 기분 값이 10를 넘으면 그 기분에 맞는 내용을 알려주는 코드를 작성해주세요.
sadsad=int(input('오늘의 우울한 정도를 숫자로 표현한다면? '))
happyhappy = int(input('오늘의 햄볶는 정도를 숫자로 표현한다면?'))
if sadsad > 10 and happyhappy > 10:
    print('지킬앤하이드니?')
elif happyhappy > 10 and sadsad < 10:
    print('긍정적이구먼')
elif sadsad > 10 and happyhappy < 10 :
    print('달달구리먹고 힘내요')
else:
    print('오늘은 쏘쏘')


# In[16]:


#Mission_4. 아래의 코드를 보고 입력받은 5개의 성적을 기준을 작성하여 코드를 완성해주세요..
#           단, 아래의 코드는 변경이 불가능합니다.
scores = [] #리스트 초기화
for i in range(5):
    re = int(input(f'{i+1}번째 성적 점수를 입력하시오: '))
    scores.append(re) #입력받은 성적 리스트에 넣기
mx_score = max(scores) #리스트에서 제일 큰 값 저장
min_score = min(scores) # 리스트에서 제일 작은 값 저장
mx_index = scores.index(mx_score) + 1 #젤 큰값의 인덱스 찾아서 저장
min_index = scores.index(min_score) + 1 #젤 작은값의 인덱스 찾아서 저장
print( "입력한 성적중 "+ str(mx_index) + "번째 점수가 가장 높은 "+ str(mx_score) + "입니다.")
print( "입력한 성적중 "+ str(min_index) + "번째 점수가 가장 낮은 "+ str(min_score) + "입니다.")
# 입력한 성적중 #번째 점수가 가장 높은 #점입니다.


# In[26]:


#Mission_5. 아래의 Song의 내용을 분석할 수 있는 코드를 작성하여 정량적 수치를 통해 의견을 작성해주세요..

# [의견 작성]
# 몰라용


song = """Fuck you and your mom and your sister and your job and your broke ass car and that shit you call art
       fuck you And your friends that i'll never see again everybody but your dog you can all FUCK OFF i swear i meant to mean the best when it ended even try to bite my tongue when you start shit
       now you're texting all my friends asking questions hey never even liked you in the first place"""
song2 = song.lower()
song2.count('fuck')



# In[17]:


#Mission_6. 이름과 점수를 입력하면 학점을 반환하여 저장하는 코드를 작성해주세요.
d = {}
d['name'] = input('너의 이름은? ') #이름을 d에 저장
d['score'] = int(input('너의 점수는? ')) #점수 저장
if d['score'] < 60:
    d['gpa'] = '한강물 뜨뜨하다' #계산된 학점 저장
elif d['score'] <70:
    d['gpa'] = 'D'
elif d['score'] <80:
    d['gpa'] = 'C'
elif d['score'] <90:
    d['gpa'] = 'B'
else:
    d['gpa'] = 'A'
print(d['name'],"님의 학점은",d['gpa'],"입니다")



# In[18]:


#Mission_7. 피보나치수열은 첫째 및 둘째 항이 1이며 그 뒤의 모든 항은 바로 앞 두 항의 합인 수열이다.
#           수열을 코드로 작성해주세요.
n = int(input('몇번째 항까지 계산할까? '))
p=[None]*(n) #공백리스트로 자리 확보
p[0]=1
p[1]=1
for i in range(2,n): #첫째 및 둘째 항은 이미 1이라서 2부터 시작함
    p[i] = p[i-1]+p[i-2]
print(p)


# In[3]:


#Missoin_8. 아래의 내용을 보고 결과를 출력하는 코드를 작성해주세요.
'''10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다.
   1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?'''

total = 0
for i in range(1,1000): #0은 빼기 (자연수 X)
    if i%3==0 or i%5==0:
        total+=i
print(total)


# In[86]:


#Mission_9. 가위,바위,보 게임을 만들어주세요.. (이긴 횟수를 알려주세요.)
import random
hehe = 0
game = ['가위','바위','보']
user = input('가위 바위 보![q--나가기]')
ri = random.randrange(len(game)) #렌덤인덱스 뽑기
#user가 안 나갈때
while user !='q':
    while user == '가위':
        if game[ri] == '보':
            print('그래 니가 이겼다')
            hehe+=1
        elif game[ri] == '바위':
            print('니가 졌지롱')
        else:
            print('비겼따')
        break
    while user == '보':
        if game[ri] == '바위':
            print('그래 니가 이겼다')
            hehe+=1
        elif game[ri] == '가위':
            print('니가 졌지롱')
        else:
            print('비겼따')
        break
    while user == '바위':
        if game[ri] == '가위':
            print('그래 니가 이겼다')
            hehe+=1
        elif game[ri] == '보':
            print('니가 졌지롱')
        else:
            print('비겼따')
        break
    user = input('가위 바위 보![q--나가기]')
    ri = random.randrange(len(game))
print(f'이긴횟수: {hehe}')
        
        


# In[10]:


#Mission_10. 커피 자판기의 계산프로그램을 만들려고 합니다.(최대 15잔을 뽑을 수 있어요. 잔당 200원)
#            돈을 값을 입력 받으면 커피를 뽑을 수 있는 잔수와 잔액을 알려주시면 됩니다. 
while True:
    money = int(input('얼마 줄래? '))
    cup = money//200
    change = money-cup*200
    if money>=200 and money<=3000:
        print(f'{cup} 잔 뽑을수 있으며 잔액은 {change}원 입니다')
        break
    elif money>3000:
        change = money-15*200
        print(f'15 잔 뽑을수 있으며 잔액은 {change}원 입니다')
        break
    else:
        print('최소 200원이다')
    

