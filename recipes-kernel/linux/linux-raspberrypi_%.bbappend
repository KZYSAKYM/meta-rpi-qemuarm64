FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = " \
    file://full-virtio.scc \
    file://full-virtio.cfg \
"

KERNEL_FEATURES_append = " \
    full-virtio.scc \
    cfg/sound.scc \
    features/kvm/qemu-kvm-enable.scc \
"
