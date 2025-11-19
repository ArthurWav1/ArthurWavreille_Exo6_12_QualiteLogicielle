For the **mvn clean** command : 
- the phase executed is "default-clean".
- The target folder does not exist.

For the **mvn test** command : 
- the phases executed are "default-resources", "default-compile", "default-testResources", "default-testCompile" and "default-test".
- Many folders are generated in the target folder : 
    - classes for the .class files
    - test-classes for the test .class files 
    - surefire-reports to log the setups (in .xml files) and the results of the tests (.txt files)
    - maven-status to store the name of the .class files created mentionned above in createdFiles.lst files and the path of the files used to created these in inputFiles.lst . 

For the **mvn package** command : 
- the phases executed are "default-resources", "default-compile", "default-testResources", "default-testCompile", "default-test" and "default-jar".
- Additionnaly to the files created with mvn test, mvn package adds the **.jar file of the project** and a **pom.properties** file in a maven-archiver folder containing the artifactId, the groupId, and the version of the project, which is useful to use this project in another maven project. 


The mvn verify command make additionnal integration test if included. 





mvn clean

(base) PS C:\Users\arthu\Bureau\3A-2IA\Qualité Logicielle\Projet_Maven\maven_bank_application\ArthurWavreille_Exo6_QualiteLogicielle\bank-application> mvn clean
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< com.imt.mines:bank-application >-------------------
[INFO] Building bank-application 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ bank-application ---
[INFO] Deleting C:\Users\arthu\Bureau\3A-2IA\Qualité Logicielle\Projet_Maven\maven_bank_application\ArthurWavreille_Exo6_QualiteLogicielle\bank-application\target
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.244 s
[INFO] Finished at: 2025-11-19T14:52:54+01:00
[INFO] ------------------------------------------------------------------------



mvn test

(base) PS C:\Users\arthu\Bureau\3A-2IA\Qualité Logicielle\Projet_Maven\maven_bank_application\ArthurWavreille_Exo6_QualiteLogicielle\bank-application> mvn test
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< com.imt.mines:bank-application >-------------------
[INFO] Building bank-application 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ bank-application ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\arthu\Bureau\3A-2IA\Qualité Logicielle\Projet_Maven\maven_bank_application\ArthurWavreille_Exo6_QualiteLogicielle\bank-application\src\main\resources
[INFO]
[INFO] --- compiler:3.13.0:compile (default-compile) @ bank-application ---
[INFO] Recompiling the module because of changed source code.
[WARNING] File encoding has not been set, using platform encoding windows-1252, i.e. build is platform dependent!
[INFO] Compiling 7 source files with javac [debug target 17] to target\classes
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ bank-application ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\arthu\Bureau\3A-2IA\Qualité Logicielle\Projet_Maven\maven_bank_application\ArthurWavreille_Exo6_QualiteLogicielle\bank-application\src\test\resources
[INFO]
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ bank-application ---
[INFO] Recompiling the module because of changed dependency.
[WARNING] File encoding has not been set, using platform encoding windows-1252, i.e. build is platform dependent!
[INFO] Compiling 5 source files with javac [debug target 17] to target\test-classes
[INFO] /C:/Users/arthu/Bureau/3A-2IA/Qualité Logicielle/Projet_Maven/maven_bank_application/ArthurWavreille_Exo6_QualiteLogicielle/bank-application/src/test/java/bankAccountApp/ACHServiceTest.java: C:\Users\arthu\Bureau\3A-2IA\Qualité Logicielle\Projet_Maven\maven_bank_application\ArthurWavreille_Exo6_QualiteLogicielle\bank-application\src\test\java\bankAccountApp\ACHServiceTest.java uses or overrides a deprecated API.
[INFO] /C:/Users/arthu/Bureau/3A-2IA/Qualité Logicielle/Projet_Maven/maven_bank_application/ArthurWavreille_Exo6_QualiteLogicielle/bank-application/src/test/java/bankAccountApp/ACHServiceTest.java: Recompile with -Xlint:deprecation for details.
[INFO]
[INFO] --- surefire:3.2.5:test (default-test) @ bank-application ---
[INFO] Using auto detected provider org.apache.maven.surefire.junit4.JUnit4Provider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running bankAccountApp.ACHServiceTest
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.763 s -- in bankAccountApp.ACHServiceTest
[INFO] Running bankAccountApp.AllTests
[INFO] Tests run: 31, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.052 s -- in bankAccountApp.AllTests
[INFO] Running bankAccountApp.BankAccountTest
[INFO] Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s -- in bankAccountApp.BankAccountTest
[INFO] Running bankAccountApp.BankTest
[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s -- in bankAccountApp.BankTest
[INFO] Running bankAccountApp.PersonTest
[INFO] Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.007 s -- in bankAccountApp.PersonTest
[INFO] 
[INFO] Results:
[INFO]
[INFO] Tests run: 62, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.260 s
[INFO] Finished at: 2025-11-19T14:53:19+01:00
[INFO] ------------------------------------------------------------------------

mvn package

[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< com.imt.mines:bank-application >-------------------
[INFO] Building bank-application 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ bank-application ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\arthu\Bureau\3A-2IA\Qualité Logicielle\Projet_Maven\maven_bank_application\ArthurWavreille_Exo6_QualiteLogicielle\bank-application\src\main\resources
[INFO]
[INFO] --- compiler:3.13.0:compile (default-compile) @ bank-application ---
[INFO] Nothing to compile - all classes are up to date.
[INFO]
[INFO] --- resources:3.3.1:testResources (default-testResources) @ bank-application ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\arthu\Bureau\3A-2IA\Qualité Logicielle\Projet_Maven\maven_bank_application\ArthurWavreille_Exo6_QualiteLogicielle\bank-application\src\test\resources
[INFO]
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ bank-application ---
[INFO] Nothing to compile - all classes are up to date.
[INFO]
[INFO] --- surefire:3.2.5:test (default-test) @ bank-application ---
[INFO] Using auto detected provider org.apache.maven.surefire.junit4.JUnit4Provider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running bankAccountApp.ACHServiceTest
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.960 s -- in bankAccountApp.ACHServiceTest
[INFO] Running bankAccountApp.AllTests
[INFO] Tests run: 31, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.087 s -- in bankAccountApp.AllTests
[INFO] Running bankAccountApp.BankAccountTest
[INFO] Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 s -- in bankAccountApp.BankAccountTest
[INFO] Running bankAccountApp.BankTest
[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 s -- in bankAccountApp.BankTest
[INFO] Running bankAccountApp.PersonTest
[INFO] Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.008 s -- in bankAccountApp.PersonTest
[INFO] 
[INFO] Results:
[INFO]
[INFO] Tests run: 62, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- jar:3.4.1:jar (default-jar) @ bank-application ---
[INFO] Building jar: C:\Users\arthu\Bureau\3A-2IA\Qualité Logicielle\Projet_Maven\maven_bank_application\ArthurWavreille_Exo6_QualiteLogicielle\bank-application\target\bank-application-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.113 s
[INFO] Finished at: 2025-11-19T14:53:41+01:00
[INFO] ------------------------------------------------------------------------



mvn verify

(base) PS C:\Users\arthu\Bureau\3A-2IA\Qualité Logicielle\Projet_Maven\maven_bank_application\ArthurWavreille_Exo6_QualiteLogicielle\bank-application> mvn verify
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< com.imt.mines:bank-application >-------------------
[INFO] Building bank-application 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ bank-application ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\arthu\Bureau\3A-2IA\Qualité Logicielle\Projet_Maven\maven_bank_application\ArthurWavreille_Exo6_QualiteLogicielle\bank-application\src\main\resources
[INFO]
[INFO] --- compiler:3.13.0:compile (default-compile) @ bank-application ---
[INFO] Recompiling the module because of changed source code.
[WARNING] File encoding has not been set, using platform encoding windows-1252, i.e. build is platform dependent!  
[INFO] Compiling 7 source files with javac [debug target 17] to target\classes
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ bank-application ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!  
[INFO] skip non existing resourceDirectory C:\Users\arthu\Bureau\3A-2IA\Qualité Logicielle\Projet_Maven\maven_bank_application\ArthurWavreille_Exo6_QualiteLogicielle\bank-application\src\test\resources
[INFO]
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ bank-application ---
[INFO] Recompiling the module because of changed dependency.
[WARNING] File encoding has not been set, using platform encoding windows-1252, i.e. build is platform dependent!  
[INFO] Compiling 5 source files with javac [debug target 17] to target\test-classes
[INFO] /C:/Users/arthu/Bureau/3A-2IA/Qualité Logicielle/Projet_Maven/maven_bank_application/ArthurWavreille_Exo6_QualiteLogicielle/bank-application/src/test/java/bankAccountApp/ACHServiceTest.java: C:\Users\arthu\Bureau\3A-2IA\Qualité Logicielle\Projet_Maven\maven_bank_application\ArthurWavreille_Exo6_QualiteLogicielle\bank-application\src\test\java\bankAccountApp\ACHServiceTest.java uses or overrides a deprecated API.
[INFO] /C:/Users/arthu/Bureau/3A-2IA/Qualité Logicielle/Projet_Maven/maven_bank_application/ArthurWavreille_Exo6_QualiteLogicielle/bank-application/src/test/java/bankAccountApp/ACHServiceTest.java: Recompile with -Xlint:deprecation for details.
[INFO]
[INFO] --- surefire:3.2.5:test (default-test) @ bank-application ---
[INFO] Using auto detected provider org.apache.maven.surefire.junit4.JUnit4Provider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running bankAccountApp.ACHServiceTest
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.808 s -- in bankAccountApp.ACHServiceTest
[INFO] Running bankAccountApp.AllTests
[INFO] Tests run: 31, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.073 s -- in bankAccountApp.AllTests
[INFO] Running bankAccountApp.BankAccountTest
[INFO] Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.009 s -- in bankAccountApp.BankAccountTest
[INFO] Running bankAccountApp.BankTest
[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s -- in bankAccountApp.BankTest
[INFO] Running bankAccountApp.PersonTest
[INFO] Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.008 s -- in bankAccountApp.PersonTest
[INFO] 
[INFO] Results:
[INFO]
[INFO] Tests run: 62, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- jar:3.4.1:jar (default-jar) @ bank-application ---
[INFO] Building jar: C:\Users\arthu\Bureau\3A-2IA\Qualité Logicielle\Projet_Maven\maven_bank_application\ArthurWavreille_Exo6_QualiteLogicielle\bank-application\target\bank-application-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.438 s
[INFO] Finished at: 2025-11-19T15:08:35+01:00
[INFO] ------------------------------------------------------------------------