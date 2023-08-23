import requests, json

def readDatabase(databaseId, headers):
    
    readUrl = f"https://api.notion.com/v1/databases/ff0fc6a4081b4aacb007a4390ebe2826/query"

    res = requests.post(readUrl, headers=headers)
    print(res.status_code)

    data = res.json()
    with open("./db.json", "w", encoding="utf8") as f:
        json.dump(data, f, ensure_ascii=False)
        
token = "secret_pXagPsMCSUQ5AvDXPwGzLGVFC5nudF6VnS1jQjCitU9"

databaseId = "ff0fc6a4081b4aacb007a4390ebe2826"

headers = {
    "Authorization": "Bearer " + token,
    "Notion-Version": "2022-02-22"
}

readDatabase(databaseId, headers)

import requests, json

def createPage(databaseId, headers, page_values):

    createdUrl = "https://www.notion.so/72509ee628124e1d8ac3620246694eb"

    newPageData = {
        "parent": {"database_id": databaseId},
        "properties": {
            "taskNum": {
                "title": [
                    {
                        "text": {
                            "number": page_values['taskNum']
                        }
                    }
                ]
            },
            "taskType": {
                "content": page_values['taskType']
            },
            "state": {
                "rich_text": [
                    {
                        "text": {
                            "content": page_values['state']
                        }
                    }
                ]
            }
        }
    }

    data = json.dumps(newPageData)

    res = requests.post(createdUrl, headers=headers, data=data)

    print(res.status_code)
        
token = "secret_pXagPsMCSUQ5AvDXPwGzLGVFC5nudF6VnS1jQjCitU9"

databaseId = "ff0fc6a4081b4aacb007a4390ebe2826"

headers = {
    "Authorization": "Bearer " + token,
    "Content-Type": "application/json",
    "Notion-Version": "2022-02-22"
}

page_values = {
    'taskNum': 1,
    'taskType': 'creating ppt slides for next presentation',
    'state': 'in progress'
}

createPage(databaseId, headers, page_values)