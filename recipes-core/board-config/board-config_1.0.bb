SUMMARY = "Configuration of wandboard"
SECTION = "config"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://board-config"

do_install () {

	install -d ${D}${bindir}
	install -m 0755 ${WORKDIR}/board-config ${D}${bindir}/

}

