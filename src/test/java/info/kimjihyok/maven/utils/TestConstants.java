package info.kimjihyok.maven.utils;

/**
 * Created by jkimab on 2016. 3. 28..
 */
public class TestConstants {
    public static final String TEST_API        = "f48d9sa54df8d9sd54f4894-api-key";
    public static final String TEST_ENGINE_KEY = "dsdf89sdf8e8e5dfdf5d-engine-key";
    public static final String[] SAFE_IMAGE_STRING = {".jpg", ".bmp", ".png", ".ashx"};

    public static final String STRING_RESPONSE = "{\n" +
            "    \"items\": [\n" +
            "        {\n" +
            "            \"kind\": \"customsearch#result\",\n" +
            "            \"title\": \"Amazon.com: Dogs: Pet Supplies: Collars, Harnesses & Leashes ...\",\n" +
            "            \"htmlTitle\": \"Amazon.com: <b>Dogs</b>: Pet Supplies: Collars, Harnesses & Leashes <b>...</b>\",\n" +
            "            \"link\": \"http://g-ecx.images-amazon.com/images/G/01/img15/pet-products/small-tiles/23695_pets_vertical_store_dogs_small_tile_8._CB312176604_.jpg\",\n" +
            "            \"displayLink\": \"www.amazon.com\",\n" +
            "            \"snippet\": \"Dog Toys\",\n" +
            "            \"htmlSnippet\": \"<b>Dog</b> Toys\",\n" +
            "            \"mime\": \"image/jpeg\",\n" +
            "            \"image\": {\n" +
            "                \"contextLink\": \"http://www.amazon.com/dogs-supplies-training-beds-collars-grooming/b?ie=UTF8&node=2975312011\",\n" +
            "                \"height\": 305,\n" +
            "                \"width\": 593,\n" +
            "                \"byteSize\": 56996,\n" +
            "                \"thumbnailLink\": \"https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRc5-7t_dQLu7lAze52yKrzr6sS0QxJN2ulqaZkIbSezu8h0O5ifl7Cmes\",\n" +
            "                \"thumbnailHeight\": 69,\n" +
            "                \"thumbnailWidth\": 135\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"kind\": \"customsearch#result\",\n" +
            "            \"title\": \"Dogs | Animal Planet\",\n" +
            "            \"htmlTitle\": \"<b>Dogs</b> | Animal Planet\",\n" +
            "            \"link\": \"http://r.ddmcdn.com/w_830/s_f/o_1/cx_0/cy_220/cw_1255/ch_1255/APL/uploads/2014/11/dog-breed-selector-australian-shepherd.jpg\",\n" +
            "            \"displayLink\": \"www.animalplanet.com\",\n" +
            "            \"snippet\": \"Dogs\",\n" +
            "            \"htmlSnippet\": \"<b>Dogs</b>\",\n" +
            "            \"mime\": \"image/jpeg\",\n" +
            "            \"image\": {\n" +
            "                \"contextLink\": \"http://www.animalplanet.com/pets/dogs/\",\n" +
            "                \"height\": 830,\n" +
            "                \"width\": 830,\n" +
            "                \"byteSize\": 79169,\n" +
            "                \"thumbnailLink\": \"https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQsqEcjRUDDLwY4gTQJLZzQKUvApKIcmf8fcVhE9UxyAvKI4ZX6jQarRvVtPw\",\n" +
            "                \"thumbnailHeight\": 144,\n" +
            "                \"thumbnailWidth\": 144\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"kind\": \"customsearch#result\",\n" +
            "            \"title\": \"Dog Day Care in Marda Loop Calgary - Marda Loop Doggie Daycare\",\n" +
            "            \"htmlTitle\": \"<b>Dog</b> Day Care in Marda Loop Calgary - Marda Loop Doggie Daycare\",\n" +
            "            \"link\": \"http://mardaloopdoggiedaycare.com/wp-content/uploads/2014/12/cute-dog2.jpg\",\n" +
            "            \"displayLink\": \"mardaloopdoggiedaycare.com\",\n" +
            "            \"snippet\": \"cute dog2\",\n" +
            "            \"htmlSnippet\": \"cute dog2\",\n" +
            "            \"mime\": \"image/jpeg\",\n" +
            "            \"image\": {\n" +
            "                \"contextLink\": \"http://mardaloopdoggiedaycare.com/\",\n" +
            "                \"height\": 1080,\n" +
            "                \"width\": 1920,\n" +
            "                \"byteSize\": 553692,\n" +
            "                \"thumbnailLink\": \"https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRfaIUByS8-6ljX0sLptMgWxunWbCdolFvIldee7etCrDMoSVchMhiltjBs\",\n" +
            "                \"thumbnailHeight\": 84,\n" +
            "                \"thumbnailWidth\": 150\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"kind\": \"customsearch#result\",\n" +
            "            \"title\": \"Dog: Dog Breeds, Adoption, Bringing a Dog Home and Care\",\n" +
            "            \"htmlTitle\": \"<b>Dog</b>: <b>Dog</b> Breeds, Adoption, Bringing a <b>Dog</b> Home and Care\",\n" +
            "            \"link\": \"https://www.petfinder.com/wp-content/uploads/2012/11/200454698-001-preparing-home-new-dog-632x475-632x353.jpg\",\n" +
            "            \"displayLink\": \"www.petfinder.com\",\n" +
            "            \"snippet\": \"Bringing A Dog Home\",\n" +
            "            \"htmlSnippet\": \"Bringing A <b>Dog</b> Home\",\n" +
            "            \"mime\": \"image/jpeg\",\n" +
            "            \"image\": {\n" +
            "                \"contextLink\": \"https://www.petfinder.com/dogs/\",\n" +
            "                \"height\": 353,\n" +
            "                \"width\": 632,\n" +
            "                \"byteSize\": 39123,\n" +
            "                \"thumbnailLink\": \"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSMZ5-rztklwPS0Jjoh6iiUF95QgarPCe3zfkBQkvcTxQ52SZ4fj5xCxQM\",\n" +
            "                \"thumbnailHeight\": 77,\n" +
            "                \"thumbnailWidth\": 137\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"kind\": \"customsearch#result\",\n" +
            "            \"title\": \"Large Breed Dog and Puppy Food | Royal Canin\",\n" +
            "            \"htmlTitle\": \"Large Breed <b>Dog</b> and Puppy Food | Royal Canin\",\n" +
            "            \"link\": \"https://www.royalcanin.com/~/media/Royal-Canin/Product-Categories/dog-maxi-landing-hero.ashx\",\n" +
            "            \"displayLink\": \"www.royalcanin.com\",\n" +
            "            \"snippet\": \"Large dogs need special\",\n" +
            "            \"htmlSnippet\": \"Large <b>dogs</b> need special\",\n" +
            "            \"mime\": \"image/\",\n" +
            "            \"fileFormat\": \"Image Document\",\n" +
            "            \"image\": {\n" +
            "                \"contextLink\": \"https://www.royalcanin.com/products/dog/maxi\",\n" +
            "                \"height\": 350,\n" +
            "                \"width\": 358,\n" +
            "                \"byteSize\": 24417,\n" +
            "                \"thumbnailLink\": \"https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRZJDCq9kEBqGCmIvCEAt3fz7jKC_cBwgC7faPKgR8haXkcszHAvlG9yVY\",\n" +
            "                \"thumbnailHeight\": 118,\n" +
            "                \"thumbnailWidth\": 121\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"kind\": \"customsearch#result\",\n" +
            "            \"title\": \"Dog history and some interesting facts\",\n" +
            "            \"htmlTitle\": \"<b>Dog</b> history and some interesting facts\",\n" +
            "            \"link\": \"http://animaliaz-life.com/data_images/dog/dog3.jpg\",\n" +
            "            \"displayLink\": \"animaliaz-life.com\",\n" +
            "            \"snippet\": \"Cool Dog\",\n" +
            "            \"htmlSnippet\": \"Cool <b>Dog</b>\",\n" +
            "            \"mime\": \"image/jpeg\",\n" +
            "            \"image\": {\n" +
            "                \"contextLink\": \"http://animaliaz-life.com/dogs.html\",\n" +
            "                \"height\": 1958,\n" +
            "                \"width\": 2510,\n" +
            "                \"byteSize\": 3127687,\n" +
            "                \"thumbnailLink\": \"https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQLFyhiOEHGCYsuRW8eDc62lISGI-cKxQ_r4rEwAzaQqSU3jM2IM3f-NNES\",\n" +
            "                \"thumbnailHeight\": 117,\n" +
            "                \"thumbnailWidth\": 150\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"kind\": \"customsearch#result\",\n" +
            "            \"title\": \"Dog - Wikipedia, the free encyclopedia\",\n" +
            "            \"htmlTitle\": \"<b>Dog</b> - Wikipedia, the free encyclopedia\",\n" +
            "            \"link\": \"https://upload.wikimedia.org/wikipedia/commons/d/d9/Collage_of_Nine_Dogs.jpg\",\n" +
            "            \"displayLink\": \"en.wikipedia.org\",\n" +
            "            \"snippet\": \"Collage of Nine Dogs.jpg\",\n" +
            "            \"htmlSnippet\": \"Collage of Nine <b>Dogs</b>.jpg\",\n" +
            "            \"mime\": \"image/jpeg\",\n" +
            "            \"image\": {\n" +
            "                \"contextLink\": \"https://en.wikipedia.org/wiki/Dog\",\n" +
            "                \"height\": 1463,\n" +
            "                \"width\": 1665,\n" +
            "                \"byteSize\": 2286651,\n" +
            "                \"thumbnailLink\": \"https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQOJ4hkMpwmOM_ytZr9qJxSMQVFCROt6tt0hGuZ3R0VoIlPwZptvdtqWPZ2vQ\",\n" +
            "                \"thumbnailHeight\": 132,\n" +
            "                \"thumbnailWidth\": 150\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"kind\": \"customsearch#result\",\n" +
            "            \"title\": \"Dog Behavior | Cesar's Way\",\n" +
            "            \"htmlTitle\": \"<b>Dog</b> Behavior | Cesar's Way\",\n" +
            "            \"link\": \"https://www.cesarsway.com/sites/newcesarsway/files/styles/large_article_preview/public/Common-dog-behaviors-explained.jpg?itok=FSzwbBoi\",\n" +
            "            \"displayLink\": \"www.cesarsway.com\",\n" +
            "            \"snippet\": \"Dog sitting outside looking\",\n" +
            "            \"htmlSnippet\": \"<b>Dog</b> sitting outside looking\",\n" +
            "            \"mime\": \"image/jpeg\",\n" +
            "            \"image\": {\n" +
            "                \"contextLink\": \"https://www.cesarsway.com/dog-behavior\",\n" +
            "                \"height\": 450,\n" +
            "                \"width\": 845,\n" +
            "                \"byteSize\": 49038,\n" +
            "                \"thumbnailLink\": \"https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRWajSqqvRtcGxIHu0zS3jq1ndGGhhIcxNPQIwx5U-1J3Z7Dk0NV-6Hq2sL\",\n" +
            "                \"thumbnailHeight\": 77,\n" +
            "                \"thumbnailWidth\": 145\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"kind\": \"customsearch#result\",\n" +
            "            \"title\": \"Aggression | ASPCA\",\n" +
            "            \"htmlTitle\": \"Aggression | ASPCA\",\n" +
            "            \"link\": \"http://www.aspca.org/sites/default/files/dog-care_dog-bite-prevention_main-image.jpg\",\n" +
            "            \"displayLink\": \"www.aspca.org\",\n" +
            "            \"snippet\": \"Aggression\",\n" +
            "            \"htmlSnippet\": \"Aggression\",\n" +
            "            \"mime\": \"image/jpeg\",\n" +
            "            \"image\": {\n" +
            "                \"contextLink\": \"http://www.aspca.org/pet-care/dog-care/common-dog-behavior-issues/aggression\",\n" +
            "                \"height\": 500,\n" +
            "                \"width\": 1040,\n" +
            "                \"byteSize\": 302180,\n" +
            "                \"thumbnailLink\": \"https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcTl2pisUFKPZCWqI-frnRMaGfQy8Tr7CQvLyteiQwibgxSv-aNf2FqbDso\",\n" +
            "                \"thumbnailHeight\": 72,\n" +
            "                \"thumbnailWidth\": 150\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"kind\": \"customsearch#result\",\n" +
            "            \"title\": \"Dog - Wikipedia, the free encyclopedia\",\n" +
            "            \"htmlTitle\": \"<b>Dog</b> - Wikipedia, the free encyclopedia\",\n" +
            "            \"link\": \"https://upload.wikimedia.org/wikipedia/commons/e/ec/Terrier_mixed-breed_dog.jpg\",\n" +
            "            \"displayLink\": \"en.wikipedia.org\",\n" +
            "            \"snippet\": \"Mixed-breed dogs have been\",\n" +
            "            \"htmlSnippet\": \"Mixed-breed <b>dogs</b> have been\",\n" +
            "            \"mime\": \"image/jpeg\",\n" +
            "            \"image\": {\n" +
            "                \"contextLink\": \"https://en.wikipedia.org/wiki/Dog\",\n" +
            "                \"height\": 1145,\n" +
            "                \"width\": 1280,\n" +
            "                \"byteSize\": 243497,\n" +
            "                \"thumbnailLink\": \"https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcR3HvV_qy-mtA4hqVAobUmYg6onZTFMfya1NKmpkeUL6-fiyZ2sDxu4AgJx\",\n" +
            "                \"thumbnailHeight\": 134,\n" +
            "                \"thumbnailWidth\": 150\n" +
            "            }\n" +
            "        }\n" +
            "    ]\n" +
            "}";


}
