int X = sc.nextInt();
            String result = sc.nextLine();
            
            int countC = 0;
            int countD = 0;
            int countN = 0;
            for(int j=0; j<result.length(); j++)
            {
                char lowerCh = result.charAt(j);
                char ch = Character.toUpperCase(lowerCh);
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
Character keyword