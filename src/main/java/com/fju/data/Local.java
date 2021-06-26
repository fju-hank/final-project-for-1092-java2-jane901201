package com.fju.data;

import java.io.*;
import java.util.ArrayList;

public class Local extends IConnectInterface{
    @Override
    public boolean bCheckConnectData() {
        try {
            fis = new FileInputStream("src/main/java/com/fju/data/LocalData/qa");
            fis = new FileInputStream("src/main/java/com/fju/data/LocalData/internet");
            //System.out.println("succeed to connect the local data");
			return true;
        } catch (FileNotFoundException e) {
            //System.out.println("false to connect the local data");
            return false;
        }
    }

    @Override
    public void connectData(String name) {
        try {
            switch (name) {
                case "question":
                    fis = new FileInputStream("src/main/java/com/fju/data/LocalData/qa");
                    break;
                case "internet":
                    fis = new FileInputStream("src/main/java/com/fju/data/LocalData/internet");
                    break;
                default:
                    System.out.println("Something Wrong");
                    break;
            }


        } catch (FileNotFoundException ignored) {

        }
    }


    @Override
    public void inputData(ArrayList<Integer> number, ArrayList<String> question,
                          ArrayList<String> a, ArrayList<String> b,
                          ArrayList<String> c, ArrayList<String> d, ArrayList<String> answer) {
        try {
            fis = new FileInputStream("src/main/java/com/fju/data/LocalData/qa");
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);

            //String n = br.readLine();
            String n = "temperate";
            //System.out.println(n);
            while (true) {
                n = br.readLine();
                int check = 0;
                String addString = "";
                if(n == null) {
                    break;
                }
                    for (int i = 0; i < n.length(); i++) {
                        String tem = String.valueOf(n.charAt(i));
                        if(!tem.equals("/")) {
                            addString += n.charAt(i);
                            if(i == n.length() -1){
                                answer.add(addString);
                            }
                        }
                        else {
                            switch (check) {
                                case 0:
                                    number.add(Integer.parseInt(addString));
                                    break;
                                case 1:
                                    question.add(addString);
                                    break;
                                case 2:
                                    a.add(addString);
                                    break;
                                case 3:
                                    b.add(addString);
                                    break;
                                case 4:
                                    c.add(addString);
                                    break;
                                case 5:
                                    d.add(addString);
                                    break;
                                default:
                                    break;
                            }

                            addString = "";
                            check++;
                        }
                    }
                    //System.out.println(n);

            }

        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    @Override
    public void inputData(ArrayList<String> internetName, ArrayList<String> url) {
        try {
            fis = new FileInputStream("src/main/java/com/fju/data/LocalData/internet");
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);

            //String n = br.readLine();
            String n = "temperate";
           // System.out.println(n);
            int check = 0;
            while (true) {
                n = br.readLine();
                if(n == null) {
                    break;
                }
                if(check == 2){
                    check = 0;
                }
                switch (check) {
                    case 0:
                        internetName.add(n);
                        break;
                    case 1:
                        url.add(n);
                        break;
                    default:
                        break;
            }
                check += 1;
//                System.out.println(n);
            }

        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
