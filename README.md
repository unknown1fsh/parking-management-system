# Otopark Yönetim Sistemi

Bu proje, basit bir otopark yönetim sistemi uygulamasıdır. Uygulama, araçların plakalarını kaydetmek, silmek ve mevcut park yerlerinin sayısını takip etmek için kullanılır. Uygulama hem backend (Java Spring Boot) hem de frontend (React.js) kısmından oluşmaktadır.

## İçindekiler

1. [Özellikler](#özellikler)
2. [Gereksinimler](#gereksinimler)
3. [Kurulum](#kurulum)
4. [Kullanım](#kullanım)
5. [API Endpoints](#api-endpoints)
6. [Önyüz Kullanımı](#önyüz-kullanımı)

## Özellikler

- Araç ekleme ve silme
- Mevcut araçları listeleme
- Boş park yerlerini gösterme
- Aynı plakanın tekrar eklenmesini önleme
- Küçük harflerle girilen plakaları otomatik olarak büyük harfe çevirme

## Gereksinimler

### Backend için:
- Java JDK 17+
- Maven 3.6+
- MySQL veritabanı

### Frontend için:
- Node.js 14+
- npm 6+

## Kurulum

### Backend

1. Projeyi klonlayın:

    ```sh
    git clone https://github.com/yourusername/parking-management-system.git
    cd parking-management-system
    ```

2. `application.properties` dosyasını yapılandırın:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/otopark
    spring.datasource.username=root
    spring.datasource.password=12345
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
    ```

3. MySQL veritabanınızı oluşturun:

    ```sql
    CREATE DATABASE otopark;
    ```

4. Maven bağımlılıklarını yükleyin ve projeyi çalıştırın:

    ```sh
    ./mvnw clean install
    ./mvnw spring-boot:run
    ```

### Frontend

1. Projeyi klonlayın (eğer klonlamadıysanız):

    ```sh
    git clone https://github.com/yourusername/parking-management-system.git
    cd parking-management-system/otopark-frontend
    ```

2. Bağımlılıkları yükleyin:

    ```sh
    npm install
    ```

3. Uygulamayı başlatın:

    ```sh
    npm start
    ```

## Kullanım

### Backend

Backend uygulaması varsayılan olarak `http://localhost:8087` adresinde çalışır. 

### Frontend

Frontend uygulaması varsayılan olarak `http://localhost:3000` adresinde çalışır. 

### API Endpoints

- `POST /api/cars` - Yeni araç ekler.
    - İstek Gövdesi: `{ "plateNumber": "34ABC34" }`
    - Yanıt: `Plaka başarıyla eklendi. Kapasite durumu: X`

- `DELETE /api/cars/{plateNumber}` - Belirtilen plakaya sahip aracı siler.
    - Yanıt: `Plaka başarıyla silindi. Kapasite durumu: X`

- `GET /api/cars` - Tüm araçları listeler.
    - Yanıt: `[{"id":1,"plateNumber":"34ABC34"}, ...]`

- `GET /api/cars/available-slots` - Boş park yerlerini döner.
    - Yanıt: `{ "availableSlots": X }`

## Önyüz Kullanımı

1. **Araç Ekle**: Plaka numarasını girin ve "Ekle" butonuna tıklayın.
2. **Araç Sil**: Plaka numarasını girin ve "Sil" butonuna tıklayın.
3. **Tüm Araçlar**: Kayıtlı tüm araçları listelemek için "Tüm Araçlar" butonuna tıklayın.
4. **Boş Yerler**: Mevcut boş park yerlerini görmek için "Boş Yerler" butonuna tıklayın.

### Notlar

- Plaka numaraları büyük harflerle kaydedilir.
- Aynı plaka numarası ile araç eklenmeye çalışıldığında hata mesajı görüntülenir.
- Silinmek istenen plaka bulunamazsa hata mesajı görüntülenir.

## Lisans

Bu proje MIT Lisansı ile lisanslanmıştır. Daha fazla bilgi için `LICENSE` dosyasına bakın.
