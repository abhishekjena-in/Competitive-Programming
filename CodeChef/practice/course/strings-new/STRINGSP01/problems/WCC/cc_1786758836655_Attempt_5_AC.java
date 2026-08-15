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
            else if(countC > countN || countC == 7)
            {
                //carlson is winner...
                prize = 60 * X;
            }
            else{
                prize = 40 * X;
            } 
            System.out.println(prize);   
        }
        
        

Character keyword