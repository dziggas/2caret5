// no imports or Strings. just a type constructor accepting 70 composite type arguments
object Firsthand { trait             f[▄,                                
                                    ▌▌▌▌▌                                                                
                                   ,▌▌▌▌▌⌐             ,▄▓▓▄,              
                                   ▓[▌▌▌▌            ,╒▌▌▌▌▌▌              
                                 ,╞▌▌▌▌▓,           ▄▌▌▌▌▌▌,
                                   ▀▌▌█           ,▌▌▌,▌▌█[             
                                                   ▌[▌▌▀
                                 ,▓▓▄                              ,                                    
                                ╞▌▌▓,       ╒▓▌▌▌▄             ,▄▌▌▌▓
          ,µa                    ,          ▓▌▌▌▌▀           ,▄▌▌▌▌▌▌▀,
        ▌▌▌▌▓],                             ╘▌▌▌▄,          ▄▌▌▌▌▌▌▌▀
        [▌▌▌▌▌▓],           ₌ ,₊,                          ╒▌▌▌▌▌▓],
         ▀[▌▌▌⌐          ,▄▌▌▄▌▌▌▌,▄▌▓▄,                    ^▀▀▀,   
                        ╘██▀[▌▌▌▌▌▌▌▌▌▌▌▌▓],        ╒▓▌▌▄
                           [▄▄▌▌▌▌▌▌▌▌▌▌▌],▀▀      ,╘▌▌▌▌
                    ,  ┌▄▄],▌▌▌▌▌▌▌▌▌▌▌▌║███          ,              ₒ,
               µ  ,╒▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌[█▀      ,▄                ,▄▌▌▌▌▓]
              ],▌▄-╝▌[▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌██▌█▌▌▌▓╦╘▀,              ╒▌▌▌▌▌▌▀
              [▌▌▌▓▄▌█▌▌▌▌▌▌▌▌▌▌▌▌],▀     ,██          ,▄▓▌▌,   ▀▀▀▀▀,
             ╽▌▌▌▌▌▌[    ▀],▌▌▌▌▌▌▌▓,         ╿▌▓,     ╫▌▌▌▌▌▀ ,        
             ╞▌▌▌▌▌▌      ,╘[▌▌▌▌▌▌▌▄          ,▓╞,    ▀▀▀ ,             
              ▌▌▌▓╽,          ▌▌▌▌▌▌▌▌▌▌▓        ,▌,                    
              ╿▌▌▌▌▌▓      ,▓▌▌▌▌▌▌▌▌▌▌▌▌     ,▌▌▌,                     
               ▌▌▌▌▌╿[    ╝▓▌▌▌▌▌▌▌▌▌▌▌▌▌,    ▓▌▌],
                █▌▌▌▓, ╒▓[▓▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌,   ▓▌▌▌,
                 ▀▌▌▌,▓▌▌▌▌▌▌▓▌▌▌▌▌▌▌▌▌▌▌,  ▓▌▌▀
                   ,▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▀
                     ,█]]],▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌█▀
                         ,     ╘█▌▌▌██▀]
  
  // give our new type constructor some type argument love...
  type h[♥, ♡♥, ♥♡, ♡, ♡♥♡, ♥♡♥, ♡♡♥[♥[♥♥♥, ♡♥, ♥♡, ♡, ♡♥♡, ♥♡♥, ♡♡♥, ♥♡♡, ♥♥♡], ♡♥, ♥♡[♡], ♡, ♡♥♡, ♥♡♥], ♥♡♡[♥, ♡♥, ♥♡, ♡, ♡♥♡[♥], ♥♡♥[♡], ♡♡♥, ♥♡♡, ♥♥♡], ♥♥♡, ♡♥♥, ♡♡♡, ♥♥♥[♡♥, ♥♡, ♡]] = Tuple12.type ;type a[♥, ♡♥[♡], ♥♡, ♡, ♡♥♡, ♥♡♥, ♡♡♥[♡], ♥♡♡, ♥♥♡, ♡♥♥, ♡♡♡, ♥♥♥[♥, ♡♥, ♥♡, ♡, ♡♥♡, ♥♡♥, ♡♡♥, ♥♡♡, ♥♥♡, ♡♥♥[♥, ♡♥], ♡♡♡, ♥♥♥[♥, ♡♥, ♥♡, ♡, ♡♥♡, ♥♡♥, ♡♡♥]]] = Tuple12.type ;type i = n; type r = s; type s = t; type t = Any; type n = s; type d = i
  // it compiles
  object love extends f[ i, r, s, t, h, a, n, d] }

// console output:
// | scala> Firsthand.love
// | res0: Firsthand.love.type = Firsthand$love$@412bbddb

// see normal_spacing.scala for the trait and constructed type formatted with normal statement spacing and alignment
