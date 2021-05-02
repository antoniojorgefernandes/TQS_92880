# 1 E) Has your project passed the defined quality gate? Elaborate your answer.

Sim, o projeto passou o quality gate definido como é possivel ver na imagem Passed_quality_gate.png.

# 1 F)
 _____________________________________________________________________________________________
|         Issue         |      Problem description      |        How to solve                 |
|_______________________|_______________________________|_____________________________________|
|                       |Random generator = new Random()| Colocar um atributo na              |
|         Bug           |"save and reuse this random"   | class do tipo random                |
|_______________________|_______________________________|_____________________________________|
|                       |                               |                                     |
|     Vulnerability     |             -----             |                ----                 |
|_______________________|_______________________________|_____________________________________|
|                       |Incremento feito dentro do for |Alterar o for loop para              |
|      Code Smells      |loop                           |for (int i = 0; i < MAXSTARS; ){...} |
|_______________________|_______________________________|_____________________________________|
|                       |Substituir os System.out e     |Usar java.util.logging.Logger        |
|      Code Smells      |System.err por loggers         |logger.log()                         |
|_______________________|_______________________________|_____________________________________|

# 2 A) Take note of the technical debt found. Explain what this value means.

É o tempo necessário para corrigir os problemas detectados (estimativa).