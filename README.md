# Inter-fragment-communication
Komunikasi Antar Fragment

Berikut beberapa hal yang perlu kamu ketahui untuk membuat fragment saling berkomunikasi:

1. Jangan langsung referensi dari fragment ke fragment lainnya.
2. Buatlah Interface yang berisikan method yang akan bertindak sebagai pembawa suatu event.
3. Implements interface pada activity
4. Fragment 1 menggunakan interface untuk mengirim pesan.
5. Pada activity, method interface yang telah diimplementasikan dapat direferensikan ke fragment 2 dan melakukan perubahan pada sesuai method yang diberikan.
