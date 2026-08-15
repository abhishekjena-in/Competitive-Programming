int X = sc.nextInt();
            String result = sc.nextLine();
            
            int countC = 0;
            int countD = 0;
            int countN = 0;
            for(int j=0; j<result.length(); j++)
            {
                char ch = result.charAt(j).toUpperCase();
                switch (ch)
                {
                    case 'C':
                        countC++;
                        break;
                        
                    case 'N':
                        countN++;
                        break;
                        
                    case 'D':
                        countD++;
                        
                    default:
                        break;
                }
            }
            
            if(countC == countN){
                prize = 55 *  X;
            }
java local
j.b snippet
j.i snippet
j.m snippet
j.n snippet
j.u snippet
Object keyword
renj snippet