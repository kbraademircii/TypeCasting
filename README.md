ERP Salary & Bonus Calculator (Java Type Casting)

Bu proje, Java eğitim maratonumun ilk gününde geliştirilmiştir. Projenin ana odak noktası, kurumsal bir ERP (Kurumsal Kaynak Planlama) sisteminde finansal verilerin işlenmesi sırasında karşılaşılan veri tipi dönüşümlerini (Type Casting) anlamlı bir senaryo ile simüle etmektir.

Proje Senaryosu
Bir şirketin maaş ve bonus yönetim sisteminde:

Çalışanların maaşları yüksek hassasiyetli (double) olarak tutulur.

Bonus oranları (float) üzerinden hesaplanan rakamlar, vergi dilimine (double) tabi tutulur.

İş Kuralı (Business Rule): Şirket politikası gereği, kuruş hassasiyeti (küsüratlar) muhasebeleşme sırasında dikkate alınmaz ve bonus ödemeleri tam sayı (int) olarak yapılır.

Teknik Detaylar (The "Why?")
Bu projede Java'daki iki temel tip dönüşümü mekanizması kullanılmıştır:

Widening Casting (Otomatik): int ve float değerlerin hesaplamalar sırasında otomatik olarak double tipine yükseltilmesi ile veri hassasiyeti korunmuştur.

Narrowing Casting (Manuel): Hesaplanan hassas bonus değerinin (double), manuel olarak (int) tipine dönüştürülmesi sağlanmıştır.

Not: Narrowing casting işlemi sırasında küsüratların yuvarlanmadığını, sadece "kesilip atıldığını" (truncation) gözlemlemek projenin temel öğrenim kazanımıdır.
Kullanılan Teknolojiler
Dil: Java SE (Standard Edition)

IDE: Eclipse

Versiyon Kontrol: Git & GitHub
