package Bai4_OOP;

public class Certificate {
	private String CertificatedID, CertificatedDate, CertificateName, CertificateRank;

	public Certificate(String certificatedID, String certificatedDate, String certificateName, String certificateRank) {
		CertificatedID = certificatedID;
		CertificatedDate = certificatedDate;
		CertificateName = certificateName;
		CertificateRank = certificateRank;
	}

	public String getCertificatedID() {
		return CertificatedID;
	}

	public void setCertificatedID(String certificatedID) {
		CertificatedID = certificatedID;
	}

	public String getCertificatedDate() {
		return CertificatedDate;
	}

	public void setCertificatedDate(String certificatedDate) {
		CertificatedDate = certificatedDate;
	}

	public String getCertificateName() {
		return CertificateName;
	}

	public void setCertificateName(String certificateName) {
		CertificateName = certificateName;
	}

	public String getCertificateRank() {
		return CertificateRank;
	}

	public void setCertificateRank(String certificateRank) {
		CertificateRank = certificateRank;
	}

	@Override
	public String toString() {
		return "CertificatedID = " + CertificatedID + ", CertificatedDate = " + CertificatedDate
				+ ", CertificateName = " + CertificateName + ", CertificateRank = " + CertificateRank;
	}

}
