package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {

        // handle exception with try catch
        getDataPart1();

        // handle a exception by throwing clause to the method declaration
        getDataPart2();

        //example for class not found
        classNotFoundExceptionExsample();

        // example for clone not support
        cloneNotSupportedException();






    }

    public static void getDataPart1(){
        String[] names = new String[2];
        int index = 0;

        Scanner scanner = new Scanner(System.in);
        while(true){

            String name = scanner.nextLine();

            try{

                if(name=="o"){
                    break;
                }
                names[index] = name;
                index++;


            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println(ex.toString());
            }
            catch (Exception ex){
                System.out.println(ex.toString());
            }finally {
                System.out.println("memory release");
            }
        }
    }

    public static void getDataPart2() throws ArrayIndexOutOfBoundsException , Exception{

        String[] names = new String[2];
        int index = 0;

        Scanner scanner = new Scanner(System.in);
        while(true){

            String name = scanner.nextLine();
            if(name=="o"){
                break;
            }
            names[index] = name;
            index++;



        }
    }

    //simple exsample for classnotfoundexception
    public static void classNotFoundExceptionExsample(){
        try{
            Class.forName("com.company.bumindu.database");
        }catch (ClassNotFoundException cnfe){
            System.err.println(cnfe.toString());
        }catch (Exception ex){
            System.err.println(ex.toString());
        }
    }

    //simple exsample for CloneNotSupportedException
    public static void cloneNotSupportedException(){

        try{
            MyTeam myTeam1 = new MyTeam("sri lanka");
            MyTeam myTeam2 = (MyTeam) myTeam1.clone();
        }catch (CloneNotSupportedException cse){
            System.err.println(cse.toString());
        }



    }




}
