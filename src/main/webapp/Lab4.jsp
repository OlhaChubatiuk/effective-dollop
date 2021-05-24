<%-- 
    Document   : newjsp
    Created on : 24 квіт. 2021 р., 22:48:52
    Author     : Ольга
--%>

<%@page import="knu.fit.ist.ta.lab4.Text"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Laba4</title>
    </head>
    <body>

        <%Text text = new Text("The IoT brings the power of the internet, data processing and analytics to the real world of physical objects. For consumers, this means interacting with the global information network without the intermediary of a keyboard and screen; many of their everyday objects and appliances can take instructions from that network with minimal human intervention."
                + "In enterprise settings, IoT can bring the same efficiencies to physical manufacturing and distribution that the internet has long delivered for knowledge work. Millions if not billions of embedded internet-enabled sensors worldwide are providing an incredibly rich set of data that companies can use to gather data about their safety of their operations, track assets"
                + " and reduce manual processes. Researchers can also use the IoT to gather data about people's preferences and behavior, though that can have serious implications for privacy and security.In a word: enormous. Priceonomics breaks it down: There are more than 50 billion IoT devices as of 2020, and those devices will generate 4.4 zettabytes of data this year."
                + " (A zettabyte is a trillion gigabytes.) By comparison, in 2013 IoT devices generated a mere 100 billion gigabytes. The amount of money to be made in the IoT market is similarly staggering; estimates on the value of the market in 2025 range from $1.6 trillion to $14.4 trillion.The basic elements of the IoT are devices that gather data. Broadly speaking,"
                + " they are internet-connected devices, so they each have an IP address. They range in complexity from autonomous vehicles that haul products around factory floors to simple sensors that monitor the temperature in buildings. They also include personal devices like fitness trackers that monitor the number of steps individuals take each day. To make that data "
                + "useful it needs to be collected, processed, filtered and analyzed, each of which can be handled in a variety of ways.Collecting the data is done by transmitting it from the devices to a gathering point. Moving the data can be done wirelessly using a range of technologies or on wired networks. The data can be sent over the internet to a data center or a "
                + "cloud that has storage and compute power or the transfer can be staged, with intermediary devices aggregating the data before sending it along.");
        %>

        <h1>This is TA and my laba 4</h1> 
        <h1>Variant 23</h1>
        <h2>Task: Clear text,count the number of words,count unique words,count 5 most frequent words,count words without "h",count words with exactly 2 unique letters,count most common 3-letter sequences</h2>

        <p>Text: </p>
        <p> <%= text.getText()%></p>

        
        
        <p>Clean text: </p>
        <p><%= text.getCleanText()%></p>

        <p>Count of words: <%= text.getTotalWordCount()%></p>

        <p>Unique words: <%= text.getUniqueWordsCount()%></p>

        <p>5 most frequent words: <%= text.getMostFrequentWords()%></p>

        <p>Words without "h": <%= text.getWordsWithoutH()%> </p>

        <p>Words with exactly 2 unique letters: <%= text.getTwoDifferentLetterWords()%></p>

        <p>Most common 3-letter sequences: <%= text.getThreeLetterSeqs()%></p>

        <a href="index.jsp">Home</a>
    </body>
</html>
