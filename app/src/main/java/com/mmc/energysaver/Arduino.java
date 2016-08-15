package com.mmc.energysaver;

/**
 * Created by mario on 12/08/16.
 */
public class Arduino {
}

/*
#include <SPI.h>
#include <Ethernet.h>

//Minhas variaveis
#define pinLamp1on 7
#define pinLamp1off 6

#define SECONDS_ON 30

// Enter a MAC address and IP address for your controller below.
// The IP address will be dependent on your local network:
byte mac[] = { 0xDE, 0xAD, 0xBE, 0xEF, 0xFE, 0xED };
IPAddress ip(192, 168, 0, 126);

// Initialize the Ethernet server library
// with the IP address and port you want to use
// (port 80 is default for HTTP):
EthernetServer server(81);
EthernetClient client;
unsigned long shutTime=0;

void setup() {
 pinMode(pinLamp1on, OUTPUT);
 pinMode(pinLamp1off, OUTPUT);

 lampOff();

 // Open serial communications and wait for port to open:
 Serial.begin(9600);

 // start the Ethernet connection and the server:
 Ethernet.begin(mac, ip);
 server.begin();
 Serial.print("server is at ");
 Serial.println(Ethernet.localIP());

 shutTime = millis();
}

void loop() {
 // listen for incoming clients
 client = server.available();
 if (client) {
   writePage();
 }

 if ((millis() - shutTime) >= (SECONDS_ON*1000) { //
   lampOff();
   shutTime = millis(); // reset counting
 }
}

void lampOff()
{
 digitalWrite(pinLamp1off, HIGH);                // GET /L turns the LED off
 digitalWrite(pinLamp1On, LOW);                // GET /L turns the LED off
 delay(200);
 digitalWrite(pinLamp1off, LOW);                // GET /L turns the LED off
}

void lampOn()
{
 digitalWrite(pinLamp1on, HIGH);               // GET /H turns the LED on
 digitalWrite(pinLamp1Off, LOW);                // GET /L turns the LED off
 delay(200);
 digitalWrite(pinLamp1on, LOW);               // GET /H turns the LED on
}

void writePage()
{
 Serial.println("new client");
 // an http request ends with a blank line
 boolean currentLineIsBlank = true;
 String currentLine = "";
 while (client.connected()) {
   if (client.available()) {
     char c = client.read();
     Serial.write(c);
     // if you've gotten to the end of the line (received a newline
     // character) and the line is blank, the http request has ended,
     // so you can send a reply
     if (c == '\n') {                    // if the byte is a newline character
       // if the current line is blank, you got two newline characters in a row.
       // that's the end of the client HTTP request, so send a response:
       if (currentLine.length() == 0) {
         // HTTP headers always start with a response code (e.g. HTTP/1.1 200 OK)
         // and a content-type so the client knows what's coming, then a blank line:
         client.println("HTTP/1.1 200 OK");
         client.println("Content-type:text/html");
         client.println();

         // the content of the HTTP response follows the header:
         client.print("<font size=\"24\" face=\"arial\">Automacao residencial<br><br><br>");
         client.print("Lampada externa: <a href=\"/H1\">ON</a> | <a href=\"/L1\">OFF</a><br><br>");
         client.print("Lampada escada: <a href=\"/H2\">ON</a> | <a href=\"/L2\">OFF</a><br></font>");
         // The HTTP response ends with another blank line:
         client.println();
         // break out of the while loop:
         break;
       }
       else {      // if you got a newline, then clear currentLine:
         currentLine = "";
       }
     }
     else if (c != '\r') {    // if you got anything else but a carriage return character,
       currentLine += c;      // add it to the end of the currentLine
     }

     // Check to see if the client request was "GET /H" or "GET /L":
     if (currentLine.endsWith("GET /H1")) {
       lampOn(); // acende
       for(int i = SECONDS_ON; i > 0; i--) { delay(1000); } //espera 30s (ou desejado)
       lampOff(); // apaga
     }
     if (currentLine.endsWith("GET /L1")) {
       lampOff(); // apaga
     }
   }
 }
 // give the web browser time to receive the data
 delay(1);
 // close the connection:
 client.stop();
 Serial.println("client disconnected");
}
* */