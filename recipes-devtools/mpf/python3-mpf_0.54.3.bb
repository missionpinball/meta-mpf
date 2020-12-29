SUMMARY = "Mission Pinball Framework (MPF) game engine for pinball machines"
HOMEPAGE = "https://github.com/missionpinball/mpf/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=c587cf68971cf0eac98e3ef562335a45"

BRANCH = "0.54.x"
COMMIT = "0497e4b13899c9044c5cf068483daa76ad5c2d2e"

DEPENDS = "python3"
RDEPENDS_${PN} += "python3 python3-grpcio python3-grpcio-tools python3-protobuf python3-psutil python3-pyserial python3-pyserial-asyncio python3-ruamel-yaml python3-sortedcontainers"

inherit pypi setuptools3

SRC_URI = "git://github.com/missionpinball/mpf.git;protocol=git;branch=${BRANCH};rev=${COMMIT}"
S = "${WORKDIR}/git"

BBCLASSEXTEND = "native nativesdk"
