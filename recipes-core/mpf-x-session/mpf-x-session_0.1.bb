SUMMARY = "Start a Game with X"

PR = "r0"

LICENSE = "CLOSED"

SECTION = "x11"
RCONFLICTS_${PN} = "matchbox-common"

SRC_URI = "file://mini-x-session"
S = "${WORKDIR}"

RDEPENDS_${PN} = "sudo"

inherit update-alternatives

ALTERNATIVE_${PN} = "x-session-manager"
ALTERNATIVE_TARGET[x-session-manager] = "${bindir}/mini-x-session"
ALTERNATIVE_PRIORITY = "100"

do_install() {
    install -d ${D}/${bindir}
    install -m 0755 ${S}/mini-x-session ${D}/${bindir}
}
