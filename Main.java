import java.util.*;
class Main {
    public static void mainFunction(ArrayList<String> subjects,ArrayList<Object> faculty){
        try{
        HashMap<String,String> facultyDict = new HashMap<String,String>();
	    ArrayList sec1=new ArrayList();
	    int temp1 = 0;
	    for(int week=1;week<7;week++){
	        List<Integer> subjectIndex = new ArrayList<>();
	        subjectIndex.add(0);
	        subjectIndex.add(1);
	        subjectIndex.add(2);
	        subjectIndex.add(3);
	        subjectIndex.add(4);
	        ArrayList days=new ArrayList();
            days.add(1);
            days.add(2);
            days.add(3);
            days.add(4);
            days.add(5);
            Main m1 = new Main();
	        for(int day=0;day<5;day++){
	            int ran = (int)(Math.random() * subjectIndex.size());
	            String subject = subjects.get(ran);
	            for(int i=0;i<faculty.size();i++){
	                ArrayList temp = (ArrayList)faculty.get(i);
	                ArrayList sub = (ArrayList)temp.get(2);
                    int sub3 = (int)temp.get(3);
	                if(subjects.indexOf(sub)!=-1 && sub3>=0){
	                    ArrayList a = new ArrayList();
	                    Set keys = facultyDict.keySet();
                        
                        for(Object key: keys){
                            a.add((String)facultyDict.get(key));
                        }
	                    if(a.indexOf(subject)!=-1){
	                        try{
	                            ArrayList temp2 = (ArrayList)faculty.get(i);
	                            String temp3 = (String)temp2.get(0);
	                            ArrayList temp6 = (ArrayList)faculty.get(i);
	                           ArrayList temp7 = (ArrayList)temp6.get(5);
	                            if(facultyDict.get(temp3) == subject){
	                                ArrayList temp4 = (ArrayList)faculty.get(i);
	                                ArrayList temp5 = (ArrayList)temp4.get(4);
	                                if(temp5.size()<=5){
	                                    int randomPeriod1 = (int)(Math.random() * days.size());
	                                    int randomPeriod =(int)days.get(randomPeriod1);
	                                    temp5.add(randomPeriod);
	                                    if(week==1 && sub3!=0){
	                                        temp.set(3, sub3--);
	                                    }
	                                    ArrayList sec2 = new ArrayList();
	                                    sec2.add(temp3);
	                                    sec2.add(randomPeriod);
	                                    sec2.add(subject);
	                                    sec2.add(temp5);
	                                    sec1.add(sec2);
	                                    break;
	                                }
	                                
	                                else if(temp5.size()<=5){
	                                    int t =(int) temp5.get(temp5.size());
	                                    if(days.indexOf(t)!=-1){
	                                        days.remove(Integer.valueOf(t));
	                                        int randomPeriod1 = (int)(Math.random() * days.size());
	                                        int randomPeriod =(int)days.get(randomPeriod1);
	                                        temp7.add(randomPeriod);
	                                    
	                                    if(week==1 && sub3!=0){
	                                        temp.set(3, sub3--);
	                                    }
	                                    ArrayList sec2 = new ArrayList();
	                                    sec2.add(temp3);
	                                    sec2.add(randomPeriod);
	                                    sec2.add(subject);
	                                    sec2.add(temp7);
	                                    sec1.add(sec2);
	                                    days.add(t);
	                                    break;
	                                }
	                                }
	                                else{
	                                    int randomPeriod1 = (int)(Math.random() * days.size());
	                                    int randomPeriod =(int)days.get(randomPeriod1);
	                                    
	                                    temp7.add(randomPeriod);
	                                    if(week==1 && sub3!=0){
	                                        temp.set(3, sub3--);
	                                    }
	                                    ArrayList sec2 = new ArrayList();
	                                    sec2.add(temp3);
	                                    sec2.add(randomPeriod);
	                                    sec2.add(subject);
	                                    sec2.add(temp7);
	                                    sec1.add(sec2);
	                                    break;
	                                
	                                }
	                              } 
	                              else{
	                                  continue;
	                              }
	                           
	                            }
	                            catch(Exception e){
	                                continue;
	                            }
	                    }else{
                            continue;
                        }
	                        
	                }else{
                            ArrayList t1 =(ArrayList)faculty.get(i);
                            String t2 =(String)t1.get(0);
                            int t3 =(int)t1.get(3);
                            ArrayList t5 =(ArrayList)faculty.get(i);
                            ArrayList t6 =(ArrayList)t1.get(5);
                            ArrayList t4 =(ArrayList)t1.get(4);
    
                            ArrayList a = new ArrayList();
	                    Set keys = facultyDict.keySet();
                        
                        for(Object key: keys){
                            a.add((String)facultyDict.get(key));
                        }
                            if(a.indexOf(subject) == -1){
                                t2=subject;
                                
                                if(t4.size()<=5){
                                    int randomPeriod1 = (int)(Math.random() * days.size());
	                                int randomPeriod =(int)days.get(randomPeriod1);
	                                    
                                    t4.add(randomPeriod);
                                    if(week==1 && sub3!=0){
                                        temp.set(3,sub3--);
                                    }
                                    ArrayList sec2=new ArrayList();
                                    sec2.add(t2);
                                    sec2.add(randomPeriod);
                                    sec2.add(subject);
                                    sec2.add(t4);
                                    sec1.add(sec2);
                                    break;
                                }
                                
                                else if(t6.size()<=5){
	                                    int t =(int) t4.get(t6.size());
                                    if(days.indexOf(t)!=-1){
                                        days.remove(Integer.valueOf(t));
                                        int randomPeriod1 = (int)(Math.random() * days.size());
	                                    int randomPeriod =(int)days.get(randomPeriod1);
	                                    
                                        t6.add(randomPeriod);
                                        if(week==1 && sub3!=0){
                                            temp.set(3,sub3--);
                                        }
                                        ArrayList sec2=new ArrayList();
                                        sec2.add(t2);
                                        sec2.add(randomPeriod);
                                        sec2.add(subject);
                                        sec2.add(t4);
                                        sec1.add(sec2);
                                        days.add(t6);
                                        break;
                                    }
                                    else{
                                        int randomPeriod1 = (int)(Math.random() * days.size());
	                                    int randomPeriod =(int)days.get(randomPeriod1);
	                                    
                                        t6.add(randomPeriod);
                                        if(week==1 && sub3!=0){
                                            temp.set(3,sub3--);
                                        }
                                        ArrayList sec2=new ArrayList();
                                        sec2.add(t2);
                                        sec2.add(randomPeriod);
                                        sec2.add(subject);
                                        sec2.add(t4);
                                        sec1.add(sec2);
                                        break;
                                    }
                                }else{
                                    continue;
                                }
                            }
                            else{
                                continue;
                            }
                        }
	                }
	            }
	}
        }
        catch(Exception e){
            System.out.println(faculty);
        }

    }
    public static void main(String args[]) {
        ArrayList sem1 = new ArrayList();
        sem1.add("ENG1");
        sem1.add("AP");
        sem1.add("C");
        sem1.add("BEE1");
        sem1.add("M1");
        String sem2[] = {"BEE2","EC","DS","PYTHON","M2"};
        String sem3[] = {"JAVA","DM","PS","SE","DLD"};
        String sem4[] = {"ENG2","WT","OR","DBMS","COA"};
        String sem5[] = {"OS","DAA","DMDW","SS","TOC"};
        String sem6[] = {"CN","FSD","MP","DAS","CS"};
       
        ArrayList<Object> faculty = new ArrayList<Object>();
        ArrayList<Object> temp1 = new ArrayList<Object>();

        ArrayList<String> subjects = new ArrayList<String>();
        subjects.add("WT");
        subjects.add("JAVA");
        subjects.add("PYTHON");
        subjects.add("CN");
        temp1.add("Sudha Mam");
        temp1.add(8);
        temp1.add(subjects);
        temp1.add(2);
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        temp1.add(a1);
        temp1.add(a2);
        temp1.add(a3);
        faculty.add(temp1);

        ArrayList<Object> temp2 = new ArrayList<Object>();

        ArrayList<String> subjects2 = new ArrayList<String>();
        subjects2.add("WT");
        subjects2.add("DLD");
        subjects2.add("DM");
        subjects2.add("FSD");
        temp2.add("rama rao sir");
        temp2.add(7);
        temp2.add(subjects2);
        temp2.add(2);
        ArrayList<Integer> b1 = new ArrayList<Integer>();
        ArrayList<Integer> b2 = new ArrayList<Integer>();
        ArrayList<Integer> b3 = new ArrayList<Integer>();
        temp2.add(b1);
        temp2.add(b2);
        temp2.add(b3);
        faculty.add(temp2);

        ArrayList<Object> temp3 = new ArrayList<Object>();

        ArrayList<String> subjects3 = new ArrayList<String>();
        subjects3.add("OR");
        subjects3.add("M1");
        subjects3.add("M2");
        subjects3.add("PS");
        temp3.add("ravikiran sir");
        temp3.add(10);
        temp3.add(subjects3);
        temp3.add(2);
        ArrayList<Integer> c1 = new ArrayList<Integer>();
        ArrayList<Integer> c2 = new ArrayList<Integer>();
        ArrayList<Integer> c3 = new ArrayList<Integer>();
        temp3.add(c1);
        temp3.add(c2);
        temp3.add(c3);
        faculty.add(temp3);

        ArrayList<Object> temp4 = new ArrayList<Object>();

        ArrayList<String> subjects4 = new ArrayList<String>();
        subjects4.add("OR");
        subjects4.add("M1");
        subjects4.add("M2");
        subjects4.add("PS");
        temp4.add("vasubabu sir");
        temp4.add(10);
        temp4.add(subjects4);
        temp4.add(2);
        ArrayList<Integer> d1 = new ArrayList<Integer>();
        ArrayList<Integer> d2 = new ArrayList<Integer>();
        ArrayList<Integer> d3 = new ArrayList<Integer>();
        temp4.add(d1);
        temp4.add(d2);
        temp4.add(d3);
        faculty.add(temp4);


        ArrayList<Object> temp5 = new ArrayList<Object>();

        ArrayList<String> subjects5 = new ArrayList<String>();
        subjects5.add("OR");
        subjects5.add("M1");
        subjects5.add("M2");
        subjects5.add("PS");
        temp5.add("kameswari mam");
        temp5.add(10);
        temp5.add(subjects5);
        temp5.add(2);
        ArrayList<Integer> e1 = new ArrayList<Integer>();
        ArrayList<Integer> e2 = new ArrayList<Integer>();
        ArrayList<Integer> e3 = new ArrayList<Integer>();
        temp5.add(e1);
        temp5.add(e2);
        temp5.add(e3);
        faculty.add(temp5);


        ArrayList<Object> temp6 = new ArrayList<Object>();

        ArrayList<String> subjects6 = new ArrayList<String>();
        subjects6.add("OR");
        subjects6.add("M1");
        subjects6.add("M2");
        subjects6.add("PS");
        temp6.add("murthy sir");
        temp6.add(9);
        temp6.add(subjects6);
        temp6.add(2);
        ArrayList<Integer> f1 = new ArrayList<Integer>();
        ArrayList<Integer> f2 = new ArrayList<Integer>();
        ArrayList<Integer> f3 = new ArrayList<Integer>();
        temp6.add(f1);
        temp6.add(f2);
        temp6.add(f3);
        faculty.add(temp6);

        ArrayList<Object> temp7 = new ArrayList<Object>();

        ArrayList<String> subjects7 = new ArrayList<String>();
        subjects7.add("COA");
        subjects7.add("DAA");
        subjects7.add("DLD");
        subjects7.add("GD");
        temp7.add("G.ramesh babu sir");
        temp7.add(1);
        temp7.add(subjects7);
        temp7.add(2);
        ArrayList<Integer> g1 = new ArrayList<Integer>();
        ArrayList<Integer> g2 = new ArrayList<Integer>();
        ArrayList<Integer> g3 = new ArrayList<Integer>();
        temp7.add(g1);
        temp7.add(g2);
        temp7.add(g3);
        faculty.add(temp7);

        ArrayList<Object> temp8 = new ArrayList<Object>();

        ArrayList<String> subjects8 = new ArrayList<String>();
        subjects8.add("COA");
        subjects8.add("DAA");
        subjects8.add("DLD");
        subjects8.add("GD");
        temp8.add("srikanth sir");
        temp8.add(4);
        temp8.add(subjects8);
        temp8.add(2);
        ArrayList<Integer> h1 = new ArrayList<Integer>();
        ArrayList<Integer> h2 = new ArrayList<Integer>();
        ArrayList<Integer> h3 = new ArrayList<Integer>();
        temp7.add(h1);
        temp7.add(h2);
        temp7.add(h3);
        faculty.add(temp8);

        ArrayList<Object> temp9 = new ArrayList<Object>();

        ArrayList<String> subjects9 = new ArrayList<String>();
        subjects9.add("DBMS");
        subjects9.add("DMDW");
        subjects9.add("OS");
        subjects9.add("CN");
        temp9.add("purushothamaraju sir");
        temp9.add(15);
        temp9.add(subjects9);
        temp9.add(2);
        ArrayList<Integer> i1 = new ArrayList<Integer>();
        ArrayList<Integer> i2 = new ArrayList<Integer>();
        ArrayList<Integer> i3 = new ArrayList<Integer>();
        temp7.add(i1);
        temp7.add(i2);
        temp7.add(i3);
        faculty.add(temp9);

        ArrayList<Object> temp10 = new ArrayList<Object>();

        ArrayList<String> subjects10 = new ArrayList<String>();
        subjects10.add("DBMS");
        subjects10.add("DMDW");
        subjects10.add("OS");
        subjects10.add("CN");
        temp10.add("ramachandrarao sir");
        temp10.add(12);
        temp10.add(subjects10);
        temp10.add(2);
        ArrayList<Integer> j1 = new ArrayList<Integer>();
        ArrayList<Integer> j2 = new ArrayList<Integer>();
        ArrayList<Integer> j3 = new ArrayList<Integer>();
        temp10.add(j1);
        temp10.add(j2);
        temp10.add(j3);
        faculty.add(temp10);

        ArrayList<Object> temp11 = new ArrayList<Object>();

        ArrayList<String> subjects11 = new ArrayList<String>();
        subjects11.add("ENG1");
        subjects11.add("SS");
        subjects11.add("SS2");
        subjects11.add("ENG2");
        temp11.add("srihariraju sir");
        temp11.add(12);
        temp11.add(subjects11);
        temp11.add(2);
        ArrayList<Integer> k1 = new ArrayList<Integer>();
        ArrayList<Integer> k2 = new ArrayList<Integer>();
        ArrayList<Integer> k3 = new ArrayList<Integer>();
        temp11.add(k1);
        temp11.add(k2);
        temp11.add(k3);
        faculty.add(temp11);


        ArrayList<Object> temp12 = new ArrayList<Object>();

        ArrayList<String> subjects12 = new ArrayList<String>();
        subjects12.add("ENG1");
        subjects12.add("SS1");
        subjects12.add("SS2");
        subjects12.add("ENG2");
        temp12.add("devi mam");
        temp12.add(12);
        temp12.add(subjects12);
        temp12.add(2);
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        ArrayList<Integer> l3 = new ArrayList<Integer>();
        temp12.add(l1);
        temp12.add(l2);
        temp12.add(l3);
        faculty.add(temp12);

        ArrayList<Object> temp13 = new ArrayList<Object>();

        ArrayList<String> subjects13 = new ArrayList<String>();
        subjects13.add("DAA");
        subjects13.add("MP");
        subjects13.add("CD");
        subjects13.add("CS");
        temp13.add("M.ramesh babu sir");
        temp13.add(7);
        temp13.add(subjects13);
        temp13.add(2);
        ArrayList<Integer> m1 = new ArrayList<Integer>();
        ArrayList<Integer> m2 = new ArrayList<Integer>();
        ArrayList<Integer> m3 = new ArrayList<Integer>();
        temp13.add(m1);
        temp13.add(m2);
        temp13.add(m3);
        faculty.add(temp13);

        ArrayList<Object> temp14 = new ArrayList<Object>();

        ArrayList<String> subjects14 = new ArrayList<String>();
        subjects14.add("SE");
        subjects14.add("OS");
        subjects14.add("CD");
        subjects14.add("CS");
        temp14.add("Kalpana mam");
        temp14.add(7);
        temp14.add(subjects14);
        temp14.add(2);
        ArrayList<Integer> n1 = new ArrayList<Integer>();
        ArrayList<Integer> n2 = new ArrayList<Integer>();
        ArrayList<Integer> n3 = new ArrayList<Integer>();
        temp14.add(n1);
        temp14.add(n2);
        temp14.add(n3);
        faculty.add(temp14);

        ArrayList<Object> temp15 = new ArrayList<Object>();

        ArrayList<String> subjects15 = new ArrayList<String>();
        subjects15.add("SE");
        subjects15.add("OS");
        subjects15.add("CD");
        subjects15.add("CS");
        temp15.add("Archana mam");
        temp15.add(7);
        temp15.add(subjects15);
        temp15.add(2);
        ArrayList<Integer> o1 = new ArrayList<Integer>();
        ArrayList<Integer> o2 = new ArrayList<Integer>();
        ArrayList<Integer> o3 = new ArrayList<Integer>();
        temp15.add(o1);
        temp15.add(o2);
        temp15.add(o3);
        faculty.add(temp15);
        
        ArrayList<Object> temp16 = new ArrayList<Object>();

        ArrayList<String> subjects16 = new ArrayList<String>();
        subjects16.add("SE");
        subjects16.add("OS");
        subjects16.add("CD");
        subjects16.add("DM");
        temp16.add("V.V.R.Maheswara Rao Sir");
        temp16.add(10);
        temp16.add(subjects16);
        temp16.add(2);
        ArrayList<Integer> p1 = new ArrayList<Integer>();
        ArrayList<Integer> p2 = new ArrayList<Integer>();
        ArrayList<Integer> p3 = new ArrayList<Integer>();
        temp16.add(p1);
        temp16.add(p2);
        temp16.add(p3);
        faculty.add(temp16);

        ArrayList<Object> temp17 = new ArrayList<Object>();

        ArrayList<String> subjects17 = new ArrayList<String>();
        subjects17.add("TOC");
        subjects17.add("MP");
        subjects17.add("DM");
        subjects17.add("CD");
        temp17.add("Shalem Raju sir");
        temp17.add(9);
        temp17.add(subjects17);
        temp17.add(2);
        ArrayList<Integer> q1 = new ArrayList<Integer>();
        ArrayList<Integer> q2 = new ArrayList<Integer>();
        ArrayList<Integer> q3 = new ArrayList<Integer>();
        temp17.add(q1);
        temp17.add(q2);
        temp17.add(q3);
        faculty.add(temp17);

        ArrayList<Object> temp18 = new ArrayList<Object>();

        ArrayList<String> subjects18 = new ArrayList<String>();
        subjects18.add("TOC");
        subjects18.add("MP");
        subjects18.add("DM");
        subjects18.add("CD");
        temp18.add("Tharaka satyanarayan sir");
        temp18.add(2);
        temp18.add(subjects18);
        temp18.add(2);
        ArrayList<Integer> r1 = new ArrayList<Integer>();
        ArrayList<Integer> r2 = new ArrayList<Integer>();
        ArrayList<Integer> r3 = new ArrayList<Integer>();
        temp18.add(r1);
        temp18.add(r2);
        temp18.add(r3);
        faculty.add(temp18);

        ArrayList<Object> temp19 = new ArrayList<Object>();
        ArrayList<String> subjects19 = new ArrayList<String>();
        subjects19.add("DS");
        subjects19.add("PYTHON");
        subjects19.add("C");
        subjects19.add("CD");
        temp19.add("Sunil sir");
        temp19.add(8);
        temp19.add(subjects19);
        temp19.add(2);
        ArrayList<Integer> s1 = new ArrayList<Integer>();
        ArrayList<Integer> s2 = new ArrayList<Integer>();
        ArrayList<Integer> s3 = new ArrayList<Integer>();
        temp19.add(s1);
        temp19.add(s2);
        temp19.add(s3);
        faculty.add(temp19);

        ArrayList<Object> temp20 = new ArrayList<Object>();
        ArrayList<String> subjects20 = new ArrayList<String>();
        subjects20.add("COA");
        subjects20.add("PYTHON");
        subjects20.add("C");
        subjects20.add("CD");
        temp20.add("Sunil sir");
        temp20.add(7);
        temp20.add(subjects19);
        temp20.add(2);
        ArrayList<Integer> t1 = new ArrayList<Integer>();
        ArrayList<Integer> t2 = new ArrayList<Integer>();
        ArrayList<Integer> t3 = new ArrayList<Integer>();
        temp20.add(t1);
        temp20.add(t2);
        temp20.add(t3);
        faculty.add(temp19);
        
        ArrayList<Object> temp21 = new ArrayList<Object>();
        ArrayList<String> subjects21 = new ArrayList<String>();
        subjects21.add("COA");
        subjects21.add("PYTHON");
        subjects21.add("C");
        subjects21.add("CD");
        temp21.add("Gayathri Mam");
        temp21.add(7);
        temp21.add(subjects20);
        temp21.add(2);
        ArrayList<Integer> u1 = new ArrayList<Integer>();
        ArrayList<Integer> u2 = new ArrayList<Integer>();
        ArrayList<Integer> u3 = new ArrayList<Integer>();
        temp21.add(u1);
        temp21.add(u2);
        temp21.add(u3);
        faculty.add(temp20);
        
        
        ArrayList<Object> temp22 = new ArrayList<Object>();
        ArrayList<String> subjects22 = new ArrayList<String>();
        subjects22.add("C");
        subjects22.add("SE");
        subjects22.add("OS");
        subjects22.add("CS");
        temp22.add("Silpa Mam");
        temp22.add(9);
        temp22.add(subjects21);
        temp22.add(2);
        ArrayList<Integer> v1 = new ArrayList<Integer>();
        ArrayList<Integer> v2 = new ArrayList<Integer>();
        ArrayList<Integer> v3 = new ArrayList<Integer>();
        temp22.add(v1);
        temp22.add(v2);
        temp22.add(v3);
        faculty.add(temp21);
        
        ArrayList<Object> temp23 = new ArrayList<Object>();
        ArrayList<String> subjects23 = new ArrayList<String>();
        subjects23.add("COA");
        subjects23.add("PYTHON");
        subjects23.add("C");
        subjects23.add("CD");
        temp23.add("Gayathri Mam");
        temp23.add(7);
        temp23.add(subjects22);
        temp23.add(2);
        ArrayList<Integer> w1 = new ArrayList<Integer>();
        ArrayList<Integer> w2 = new ArrayList<Integer>();
        ArrayList<Integer> w3 = new ArrayList<Integer>();
        temp23.add(w1);
        temp23.add(w2);
        temp23.add(w3);
        faculty.add(temp22);
        
        ArrayList<Object> temp24 = new ArrayList<Object>();
        ArrayList<String> subjects24 = new ArrayList<String>();
        subjects24.add("C");
        subjects24.add("PYTHON");
        subjects24.add("DS");
        subjects24.add("FSD");
        temp24.add("Swathi Mam");
        temp24.add(8);
        temp24.add(subjects23);
        temp24.add(2);
        ArrayList<Integer> x1 = new ArrayList<Integer>();
        ArrayList<Integer> x2 = new ArrayList<Integer>();
        ArrayList<Integer> x3 = new ArrayList<Integer>();
        temp24.add(x1);
        temp24.add(x2);
        temp24.add(x3);
        faculty.add(temp23);
        
        ArrayList<Object> temp25 = new ArrayList<Object>();
        ArrayList<String> subjects25 = new ArrayList<String>();
        subjects25.add("C");
        subjects25.add("PYTHON");
        subjects25.add("JAVA");
        subjects25.add("MC");
        temp25.add("Seenu sir");
        temp25.add(9);
        temp25.add(subjects24);
        temp25.add(2);
        ArrayList<Integer> y1 = new ArrayList<Integer>();
        ArrayList<Integer> y2 = new ArrayList<Integer>();
        ArrayList<Integer> y3 = new ArrayList<Integer>();
        temp25.add(y1);
        temp25.add(y2);
        temp25.add(y3);
        faculty.add(temp24);
        
        ArrayList<Object> temp26 = new ArrayList<Object>();
        ArrayList<String> subjects26 = new ArrayList<String>();
        subjects26.add("FSD");
        subjects26.add("JAVA");
        subjects26.add("CS");
        subjects26.add("DAS");
        temp26.add("Phaneendra Varma sir");
        temp26.add(9);
        temp26.add(subjects25);
        temp26.add(2);
        ArrayList<Integer> z1 = new ArrayList<Integer>();
        ArrayList<Integer> z2 = new ArrayList<Integer>();
        ArrayList<Integer> z3 = new ArrayList<Integer>();
        temp26.add(z1);
        temp26.add(z2);
        temp26.add(z3);
        faculty.add(temp25);
        
        ArrayList<Object> temp27 = new ArrayList<Object>();
        ArrayList<String> subjects27 = new ArrayList<String>();
        subjects27.add("AP");
        subjects27.add("EP");
        subjects27.add("P1");
        subjects27.add("P2");
        temp27.add("Srinivas sir");
        temp27.add(9);
        temp27.add(subjects26);
        temp27.add(2);
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> A2 = new ArrayList<Integer>();
        ArrayList<Integer> A3 = new ArrayList<Integer>();
        temp27.add(A1);
        temp27.add(A2);
        temp27.add(A3);
        faculty.add(temp26);
        
        ArrayList<Object> temp28 = new ArrayList<Object>();
        ArrayList<String> subjects28 = new ArrayList<String>();
        subjects28.add("AP");
        subjects28.add("EP");
        subjects28.add("P1");
        subjects28.add("P2");
        temp28.add("Bhramhanandam sir");
        temp28.add(8);
        temp28.add(subjects27);
        temp28.add(2);
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        ArrayList<Integer> B2 = new ArrayList<Integer>();
        ArrayList<Integer> B3 = new ArrayList<Integer>();
        temp28.add(B1);
        temp28.add(B2);
        temp28.add(B3);
        faculty.add(temp27);
        
        
        ArrayList<Object> temp29 = new ArrayList<Object>();
        ArrayList<String> subjects29 = new ArrayList<String>();
        subjects29.add("AP");
        subjects29.add("EP");
        subjects29.add("P1");
        subjects29.add("P2");
        temp29.add("Bhramhanandam sir");
        temp29.add(8);
        temp29.add(subjects28);
        temp29.add(2);
        ArrayList<Integer> C1 = new ArrayList<Integer>();
        ArrayList<Integer> C2 = new ArrayList<Integer>();
        ArrayList<Integer> C3 = new ArrayList<Integer>();
        temp29.add(B1);
        temp29.add(B2);
        temp29.add(B3);
        faculty.add(temp28);
        
        ArrayList<Object> temp30 = new ArrayList<Object>();
        ArrayList<String> subjects30 = new ArrayList<String>();
        subjects30.add("AP");
        subjects30.add("EP");
        subjects30.add("P1");
        subjects30.add("P2");
        temp30.add("Jagadeesh sir");
        temp30.add(10);
        temp30.add(subjects29);
        temp30.add(2);
        ArrayList<Integer> D1 = new ArrayList<Integer>();
        ArrayList<Integer> D2 = new ArrayList<Integer>();
        ArrayList<Integer> D3 = new ArrayList<Integer>();
        temp28.add(D1);
        temp28.add(D2);
        temp28.add(D3);
        faculty.add(temp29);
        
        
        ArrayList<Object> temp31 = new ArrayList<Object>();
        ArrayList<String> subjects31 = new ArrayList<String>();
        subjects31.add("EC");
        subjects31.add("AC");
        subjects31.add("C1");
        subjects31.add("C2");
        temp31.add("Ganesh sir");
        temp31.add(10);
        temp31.add(subjects30);
        temp31.add(2);
        ArrayList<Integer> E1 = new ArrayList<Integer>();
        ArrayList<Integer> E2 = new ArrayList<Integer>();
        ArrayList<Integer> E3 = new ArrayList<Integer>();
        temp31.add(E1);
        temp31.add(E2);
        temp31.add(E3);
        faculty.add(temp30);
        
        ArrayList<Object> temp32 = new ArrayList<Object>();
        ArrayList<String> subjects32 = new ArrayList<String>();
        subjects32.add("ENG1");
        subjects32.add("ENG2");
        subjects32.add("SS");
        subjects32.add("SS2");
        temp32.add("Arun sir");
        temp32.add(7);
        temp32.add(subjects31);
        temp32.add(2);
        ArrayList<Integer> F1 = new ArrayList<Integer>();
        ArrayList<Integer> F2 = new ArrayList<Integer>();
        ArrayList<Integer> F3 = new ArrayList<Integer>();
        temp32.add(F1);
        temp32.add(F2);
        temp32.add(F3);
        faculty.add(temp31);
        
        ArrayList<Object> temp33 = new ArrayList<Object>();
        ArrayList<String> subjects33 = new ArrayList<String>();
        subjects33.add("BEE1");
        subjects33.add("BEE2");
        subjects33.add("AP");
        subjects33.add("EP");
        temp33.add("Swaroop sir");
        temp33.add(6);
        temp33.add(subjects32);
        temp33.add(2);
        ArrayList<Integer> G1 = new ArrayList<Integer>();
        ArrayList<Integer> G2 = new ArrayList<Integer>();
        ArrayList<Integer> G3 = new ArrayList<Integer>();
        temp33.add(G1);
        temp33.add(G2);
        temp33.add(G3);
        faculty.add(temp32);
        
        
        ArrayList<Object> temp34 = new ArrayList<Object>();
        ArrayList<String> subjects34 = new ArrayList<String>();
        subjects34.add("BEE1");
        subjects34.add("BEE2");
        subjects34.add("AP");
        subjects34.add("EP");
        temp34.add("Narayana Kiran sir");
        temp34.add(5);
        temp34.add(subjects33);
        temp34.add(2);
        ArrayList<Integer> H1 = new ArrayList<Integer>();
        ArrayList<Integer> H2 = new ArrayList<Integer>();
        ArrayList<Integer> H3 = new ArrayList<Integer>();
        temp34.add(H1);
        temp34.add(H2);
        temp34.add(H3);
        faculty.add(temp33);
        
        ArrayList<Object> temp35 = new ArrayList<Object>();
        ArrayList<String> subjects35 = new ArrayList<String>();
        subjects35.add("BEE1");
        subjects35.add("BEE2");
        subjects35.add("AP");
        subjects35.add("EP");
        temp35.add("Kalyan Sagar sir");
        temp35.add(4);
        temp35.add(subjects34);
        temp35.add(2);
        ArrayList<Integer> I1 = new ArrayList<Integer>();
        ArrayList<Integer> I2 = new ArrayList<Integer>();
        ArrayList<Integer> I3 = new ArrayList<Integer>();
        temp35.add(I1);
        temp35.add(I2);
        temp35.add(I3);
        faculty.add(temp34);
        
        ArrayList<Object> temp36 = new ArrayList<Object>();
        ArrayList<String> subjects36 = new ArrayList<String>();
        subjects36.add("DWDM");
        subjects36.add("DBMS");
        subjects36.add("DAS");
        subjects36.add("CS");
        temp36.add("Ramu sir");
        temp36.add(10);
        temp36.add(subjects35);
        temp36.add(2);
        ArrayList<Integer> J1 = new ArrayList<Integer>();
        ArrayList<Integer> J2 = new ArrayList<Integer>();
        ArrayList<Integer> J3 = new ArrayList<Integer>();
        temp36.add(J1);
        temp36.add(J2);
        temp36.add(J3);
        faculty.add(temp35);
        Main m = new Main();
        m.mainFunction(sem1, faculty);
    }
}