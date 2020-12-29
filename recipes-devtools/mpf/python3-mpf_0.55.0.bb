SUMMARY = "Mission Pinball Framework (MPF) game engine for pinball machines"
HOMEPAGE = "https://github.com/missionpinball/mpf/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=c587cf68971cf0eac98e3ef562335a45"

BRANCH = "refactor_dependencies"
COMMIT = "5a26e02866344f1959739f372556702a6f7ef365"

DEPENDS = "python3"
RDEPENDS_${PN} += "python3 python3-grpcio-mpf python3-grpcio-tools-mpf python3-protobuf-mpf (=3.14.0) python3-psutil-mpf python3-pyserial-mpf python3-pyserial-asyncio-mpf python3-ruamel-yaml-mpf python3-sortedcontainers-mpf"

inherit pypi setuptools3

SRC_URI = "git://github.com/missionpinball/mpf.git;protocol=git;branch=${BRANCH};rev=${COMMIT}"
S = "${WORKDIR}/git"

BBCLASSEXTEND = "native nativesdk"
