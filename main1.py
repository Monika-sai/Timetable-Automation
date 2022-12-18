import random
from collections import defaultdict
sem1 = ["ENG1", "AP", "C", "BEE1", "M1"]
sem2 = ["BEE2", "EC", "DS", "PYTHON", "M2"]
sem3 = ["JAVA", "DM", "PS", "SE", "DLD"]
sem4 = ["ENG2", "WT", "OR", "DBMS", "COA"]
sem5 = ["OS", "DAA", "DMDW", "SS", "TOC"]
sem6 = ["CN" , "FSD" , "MP" , "DAS" , "CS"]
#totalSem = [["ENG", "AP", "C", "BEE1", "M1"], ["BEE2", "EC", "DS", "PYTHON", "M2"], ["JAVA", "DM", "PS", "SE", "DLD"], ["ENG2", "WT", "OR", "DBMS", "COA"], ["OS", "DAA", "DMDW", "SS", "TOC"], ["CN" , "FSD" , "MP" , "DAS" , "CS"]]
faculty = [["sudha mam", 8, ["WT", "JAVA", "CN", "PYTHON"], 2, [], [], []],
["ramaroa sir", 7, ["WT", "DLD", "DM", "FSD"], 2, [], [], []],
["ravikiran sir", 10, ["OR", "M1", "M2", "PS"], 2, [], [], []],
["vasubabu sir", 10, ["OR", "M1", "M2", "PS"], 2, [], [], []],
["kameswari mam", 10, ["OR", "M1", "M2", "PS"], 2, [], [], []],
["murthy sir", 9, ["OR", "M1", "M2", "PS"], 2, [], [], []], 
["G.ramesh babu sir", 1, ["COA", "DAA", "DLD", "GD"], 2, [], [], []], 
["srikanth sir", 4, ["COA", "DAA", "DM", "GD"], 2, [], [], []],
["purushothamaraju sir", 15, ["DBMS", "DMDW", "OS", "CN"], 2, [], [], []], 
["ramachandraroa sir", 12,  ["DBMS", "DMDW", "OS", "CN"], 2, [], [], []], 
["srihariraju sir", 12,  ["ENG1", "SS", "SS2", "ENG2"], 2, [], [], []], 
["devi mam", 7,  ["ENG1", "SS", "SS2", "ENG2"],2,[],[],[]],
["M.ramesh babu sir",7,["DAA","MP","CD","CS"], 2 ,[] ,[] ,[]],
["Kalpana mam",7,["SE","OS","CD","CS"], 2 ,[] ,[] ,[]],
["Archana mam",7,["SE","OS","CD","CS"], 2 ,[] ,[] ,[]],
["V.V.R.Maheshwara Rao sir",10,["SE","OS","CD","DM"], 2 , [] ,[] ,[]],
["Shalem Raju sir",9,["TOC","MP","DM","CD"], 2 ,[] , [] , [] , []],
["Tharaka satyanaran sir",2,["TOC","MP","DM","CD"], 2 ,[] , [] , [] , []],
["Sunil sir",8 ,["DS","PYTHON","DAA","TOC"], 2 ,[] , [] , [] , []],
["Gayathri mam", 7,["COA","PYTHON","C","CD"], 2 ,[] , [] , [] , []],
["Silpa mam", 9,["C","SE","OS","CS"], 2 ,[] , [] , [] , []],
["Swathi mam",8,["C","PYTHON","DS","FSD"], 2 ,[] , [] , [] , []],
["Seenu sir", 9, ["C", "PYTHON", "JAVA", "MC"], 2, [], [], []],
["Phaneendhra verma sir",9,["FSD","CS","JAVA","DAS"], 2 ,[] , [] , [] , []],
["Srinivas sir",9,["AP","EP","P1","P2"], 2 ,[] , [] , [] , []],
["Bhramhanandam sir",8,["AP","EP","P1","P2"], 2 ,[] , [] , [] , []],
["Jagadeesh sir",10,["EC","AC","C1","C2"], 2 ,[] , [] , [] , []],
["Ganesh sir",10,["EC","AC","C1","C2"], 2 ,[] , [] , [] , []],
["Arun sir",7,["ENG1","ENG2","SS","SS2"], 2 ,[] , [] , [] , []],
["Swaroop sir",6,["BEE1","BEE2","AP","EP"], 2 ,[] , [] , [] , []],
["Narayana kiran sir",5,["BEE1","BEE2","AP","EP"], 2 ,[] , [] , [] , []],
["Kalyan sagar sir",4,["BEE1","BEE2","AP","EP"], 2 ,[] , [] , [] , []],
["Ramu sir",9,["DMDW","DBMS","DAS","CS"], 2 ,[] , [] , [] , []]]
faculty = sorted(faculty, key = lambda x : x[1], reverse = True)
week = ["Mon", "Tue", "Wed", "Thr", "Fri", "Sat"]
def mainFunction(subjects):
    facultyDict = {}
    sec1 = []
    temp = 0
    for week in range(1, 7):
        subjectIndex = [0,1,2,3,4]
        days = [1,2,3,4,5]
        for day in range(0, 5):
            ran = random.choice(subjectIndex)
            subject = subjects[ran]
            #print(subject)
            for i in faculty:
                if subject in i[2] and i[3] >= 0:
                    if subject in facultyDict.values():
                        try:
                            if facultyDict[i[0]] == subject:
                                if len(i[4]) <= 5:
                                    #print("Hello")
                                    randomPeriod = random.choice(days)
                                    i[4].append(randomPeriod)
                                    if week == 1 and i[3] != 0:
                                        i[3] = i[3] - 1
                                    sec1.append([i[0], randomPeriod, subject, i[4]])
                                    break
                                elif len(i[5]) <= 5:
                                    
                                    temp = i[4][len(i[5])]
                                    if temp in days:
                                        days.remove(temp)
                                        randomPeriod = random.choice(days)
                                        #print(days, randomPeriod)
                                        i[5].append(randomPeriod)
                                        #print(i[4], len(i[5]), i[4][len(i[5])], i[5])
                                        if week == 1 and i[3] != 0:
                                            i[3] = i[3] - 1
                                        sec1.append([i[0], randomPeriod, subject, i[5]])
                                        days.append(temp)
                                        break
                                    else:
                                        randomPeriod = random.choice(days)
                                        #print(days, randomPeriod)
                                        i[5].append(randomPeriod)
                                        #print(i[4], len(i[5]), i[4][len(i[5])], i[5])
                                        if week == 1 and i[3] != 0:
                                            i[3] = i[3] - 1
                                        sec1.append([i[0], randomPeriod, subject, i[5]])
                                        break

                                else:
                                    continue
                            else:
                                continue
                        except:
                            continue
                    else:
                        if i[0] not in facultyDict and i[3] != 0:
                            facultyDict[i[0]] = subject
                            if len(i[4]) <= 5:
                                    #print("Hello")
                                    randomPeriod = random.choice(days)
                                    i[4].append(randomPeriod)
                                    if week == 1 and i[3] != 0:
                                        i[3] = i[3] - 1
                                    sec1.append([i[0], randomPeriod, subject, i[4]])
                                    break
                            elif len(i[5]) <= 5:
                                    temp = i[4][len(i[5])]
                                    if temp in days:
                                        days.remove(temp)
                                        randomPeriod = random.choice(days)
                                        #print(days, randomPeriod)
                                        i[5].append(randomPeriod)
                                        #print(i[4], len(i[5]), i[4][len(i[5])], i[5])
                                        if week == 1 and i[3] != 0:
                                            i[3] = i[3] - 1
                                        sec1.append([i[0], randomPeriod, subject, i[5]])
                                        days.append(temp)
                                        break
                                    else:
                                        randomPeriod = random.choice(days)
                                        #print(days, randomPeriod)
                                        i[5].append(randomPeriod)
                                        #print(i[4], len(i[5]), i[4][len(i[5])], i[5])
                                        if week == 1 and i[3] != 0:
                                            i[3] = i[3] - 1
                                        sec1.append([i[0], randomPeriod, subject, i[5]])
                                        break
                            else:
                                continue
                        else:
                            continue
                else:
                    continue
            #print(facultyDict)
            #print(days, randomPeriod, temp)
            #days.append(temp)
            days.append(randomPeriod)
            days.remove(randomPeriod)
            subjectIndex.remove(ran)
            #days = list(set(days))
    #print(faculty)
    '''
    for i in faculty:
        if len(i[5]):
            print(i[0], i[4], i[5])
'''
    print(".............................................................")
    
    print(facultyDict)
    
    week = ["Mon", "Tue", "Wed", "Thr", "Fri", "Sat"]
    print("          1        2         3       4        5")
    c = 0
    for i in range(6):
        print(week[i], end = "    ")
        for j in range(0, len(sec1), 6):
            print(sec1[c][2], end = "        ")
            c += 1
        print()
    print("          1        2         3       4        5")
    c = 0
    for i in range(6):
        print(week[i], end = "    ")
        for j in range(0, len(sec1), 6):
            print(sec1[c][0], end = "        ")
            c += 1
        print()
    print("..........................................................................")


mainFunction(sem1)
mainFunction(sem1)
mainFunction(sem1)
mainFunction(sem3)
mainFunction(sem3)
mainFunction(sem3)
mainFunction(sem5)
mainFunction(sem5)
#mainFunction(sem5)

'''
mainFunction(sem2)
mainFunction(sem2)
mainFunction(sem2)
mainFunction(sem4)
mainFunction(sem4)
mainFunction(sem4)
'''
'''


def helper(subjects, facultyDict1):
    f = True
    while(f):
        
        y = defaultdict(int)
        y = facultyDict1.copy()
        print(faculty)
        #print(facultyDict)
        try:
            sec1 = mainFunction(subjects, y, x)
            print("          1        2         3       4        5")
            c = 0
            for i in range(6):
                print(week[i], end = "    ")
                for j in range(0, len(sec1), 6):
                    print(sec1[c][2], end = "        ")
                    c += 1
                print()
            print("          1        2         3       4        5")
            c = 0
            for i in range(6):
                print(week[i], end = "    ")
                for j in range(0, len(sec1), 6):
                    print(sec1[c][0], end = "        ")
                    c += 1
                print()
            f = False
        except:
            y = defaultdict(int)
            y = facultyDict1.copy()
            x = defaultdict(int)
            x = facultyDict.copy()
            f = True
'''