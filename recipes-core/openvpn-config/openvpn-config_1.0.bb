SUMMARY = "Configuration for openvpn client"
SECTION = "config"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://client-main.conf \
	file://client-backup.conf \
	file://wandboard.crt \
	file://wandboard.key \
	file://ca.crt \
"

do_install () {

	install -d ${D}${sysconfdir}/openvpn
	install -m 0644 ${WORKDIR}/client-main.conf ${D}${sysconfdir}/openvpn
	install -m 0644 ${WORKDIR}/client-backup.conf ${D}${sysconfdir}/openvpn

 	install -d ${D}${sysconfdir}/openvpn/easy-rsa
 	install -d ${D}${sysconfdir}/openvpn/easy-rsa/keys

	install -m 0644 ${WORKDIR}/wandboard.crt ${D}${sysconfdir}/openvpn/easy-rsa/keys
	install -m 0644 ${WORKDIR}/wandboard.key ${D}${sysconfdir}/openvpn/easy-rsa/keys
	install -m 0644 ${WORKDIR}/ca.crt ${D}${sysconfdir}/openvpn/easy-rsa/keys
}

CONFFILES_${PN} = "${sysconfdir}/openvpn/client.conf"

