# LocalFoodRecommender
A food rating aggregator service that crawls various input
source such as blogs, Facebook, Twitter and Instagram.

The data will be stored in a database.

For now, the data that the service will crawl are:
OriginalName, StandardizedName, Location, Rating.

OriginalName refers to the name that is crawled from the raw input.
StandardizedName refers to the name after the transformation by our
service.

For examples, Char Kway Teow can be called under different names,
namely Char Koay Teow, CKT or even their Chinese counterparts. Hence,
we required a mapping from their original name to a standardized name.

## WebCrawler (WIP)
The crawler crawls data from various inputs. For now, we will be
focusing on crawling blogs as it is the easiest.

## Transformer (WIP)
After the input has been crawled, it is fed into a transformer
service to transform our input into data that is acceptable by our
table in database.

For now, the input will be converted into a CSV format.

## Database (Future Work)

