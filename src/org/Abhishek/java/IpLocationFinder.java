package org.Abhishek.java;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IpLocationFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=1)
		{
			System.out.println("Only one arguement should be passed");
		}
		else
		{
			String ipAddress=args[0];
			GeoIPService Ipservice= new GeoIPService();
			GeoIPServiceSoap geoIpServiceSoap=Ipservice.getGeoIPServiceSoap();
			GeoIP geoIp=geoIpServiceSoap.getGeoIP(ipAddress);
			System.out.println(geoIp.getCountryName());
		}

	}

}
