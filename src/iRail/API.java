/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iRail;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import util.StringUtil;

/**
 *
 * @author Maartje
 */
public class API {
    private static String doCall(String path) throws IOException {
        String out = "";
        
        HttpConnection httpConn = null;
        String url = "http://irail-csv.maartje.dev" + path;

        InputStream is = null;
        OutputStream os = null;

        try {
            // Open an HTTP Connection object
            httpConn = (HttpConnection) Connector.open(url);

            // Setup HTTP Request
            httpConn.setRequestMethod(HttpConnection.GET);
            httpConn.setRequestProperty("User-Agent",
                    "Profile/MIDP-1.0 Confirguration/CLDC-1.0");

            /**
             * Initiate connection and check for the response code. If the
             * response code is HTTP_OK then get the content from the target
             *
             */
            int respCode = httpConn.getResponseCode();
            if (respCode == httpConn.HTTP_OK) {
                StringBuffer sb = new StringBuffer();
                os = httpConn.openOutputStream();
                is = httpConn.openDataInputStream();
                int chr;
                while ((chr = is.read()) != -1) {
                    sb.append((char) chr);
                }

                out = sb.toString();
            } else {
                System.out.println("Error in opening HTTP Connection. Error#" + respCode);
            }

        } finally {
            if (is != null) {
                is.close();
            }
            if (os != null) {
                os.close();
            }
            if (httpConn != null) {
                httpConn.close();
            }
        }
        return out;
    }
    
    public static String[] getStations(String search) {
        String[] out = null;
        try {
            String response = API.doCall("/stations?search="+search);
            out = StringUtil.Split(response, "\n", 1);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        return out;
    }
    
    public static Connection[] getConnections(String from, String to, String time, String date, String timesel) {
        Vector out = new Vector();
        try {
            String response = API.doCall("/connections?from="+from+"&to="+to+"&date="+date+"&time="+time+"&timesel="+timesel);
            String[] connections = StringUtil.Split(response, "\n", 1);
            for (int i = 0; i < connections.length; i++) {
                String line = connections[i];
                if (line != null) {
                     String[] parts = StringUtil.Split(line, ",", 0);
                    if (parts.length >= 4) {
                        out.addElement(new Connection(parts[0], parts[1], parts[2], parts[3]));
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        // convert the vector into an array
        Connection[] connectionArray = new Connection[out.size()];
        for (int i = 0; i < connectionArray.length; i++) {
            connectionArray[i] = (Connection) out.elementAt(i);
        }
        return connectionArray;
    }
}
