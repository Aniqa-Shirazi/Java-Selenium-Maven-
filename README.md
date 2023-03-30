# Java-Selenium-Maven-
How to create jar with java maven selenium project in apache NetBeans IDE.
deploy java-maven project with selenium web driver. 
Driver should be placed as target direcotory. Jar file will be created in target file.
click on project directory and click build with dependi
**pom.xml should be as in repository. here com.mycompany.helloselenium.HelloSelenium is main class having main()**
    <plugins>
      <plugin>
    <artifactId>maven-assembly-plugin</artifactId>
    <configuration>
        <descriptorRefs>
            <descriptorRef>jar-with-dependencies</descriptorRef>
        </descriptorRefs>
        <archive>
            <manifest>
                <mainClass>com.mycompany.helloselenium.HelloSelenium</mainClass>
            </manifest>
        </archive>
    </configuration>
    <executions>
        <execution>
            <id>make-assembly</id>
            <phase>package</phase>
            <goals>                         
                <goal>single</goal>
            </goals>
        </execution>
    </executions>
</plugin>
    </plugins>
