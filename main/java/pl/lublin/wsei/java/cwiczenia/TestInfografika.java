package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.Infografika;

public class TestInfografika {
    public static void main(String[] args) {

        String tekst = "<item>\n" +
                "\t\t\t<title><![CDATA[Infografika - Dzień Statystyki Polskiej (9 marca)]]></title>\n" +
                "\t\t\t<pubDate><![CDATA[Wed, 09 Mar 2022 09:00:00 +0100]]></pubDate>\n" +
                "\t\t\t<link>https://stat.gov.pl/infografiki-widzety/infografiki/infografika-dzien-statystyki-polskiej-9-marca,26,3.html</link>\n" +
                "\t\t\t<guid isPermaLink=\"false\">https://stat.gov.pl/infografiki-widzety/infografiki/infografika-dzien-statystyki-polskiej-9-marca,26,3.html</guid>\n" +
                "\t\t\t<media:content url=\"https://stat.gov.pl/files/gfx/portalinformacyjny/pl/defaultaktualnosci/5866/26/3/1/dzien_statystyki_polskiej_2022_infogr_pl_2.png\" type=\"image/png\" width=\"2134\" height=\"3021\">\n" +
                "\t\t\t\t<media:description type=\"plain\"><![CDATA[]]></media:description>\n" +
                "\t\t\t\t<media:thumbnail url=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/26/3/1/dzien_statystyki_polskiej_2022_infogr_pl_2,k1uUwl-caFOE6tCTiHtf.png\" />\n" +
                "\t\t\t</media:content>\n" +
                "\t\t\t<description><![CDATA[<div><img src=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/26/3/1/dzien_statystyki_polskiej_2022_infogr_pl_2,k1uUwl-caFOE6tCTiHtf.png\" alt=\"\" width=\"280\" height=\"212\"/></div>]]></description>\n" +
                "\t\t</item>";

        Infografika i = new Infografika(tekst);
    }
}
