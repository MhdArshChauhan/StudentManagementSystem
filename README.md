1.GET ALL DEPT
[
    {
        "createdAt": "2026-02-01T19:36:16",
        "departmentCode": "CS",
        "departmentId": 1,
        "departmentName": "Computer Science",
        "description": "Handles computer science and software programs",
        "updatedAt": "2026-02-01T19:36:16"
    },
    {
        "createdAt": "2026-02-01T19:36:16",
        "departmentCode": "IT",
        "departmentId": 2,
        "departmentName": "Information Technology",
        "description": "Focuses on IT systems and application development",
        "updatedAt": "2026-02-01T19:36:16"
    },
    {
        "createdAt": "2026-02-01T19:36:16",
        "departmentCode": "ME",
        "departmentId": 3,
        "departmentName": "Mechanical Engineering",
        "description": "Deals with mechanical systems and manufacturing",
        "updatedAt": "2026-02-01T19:36:16"
    },
    {
        "createdAt": "2026-02-01T19:36:16",
        "departmentCode": "BBA",
        "departmentId": 4,
        "departmentName": "Business Administration",
        "description": "Covers business management and finance",
        "updatedAt": "2026-02-01T19:36:16"
    }
]

2.GET DEPT BY ID
{
    "createdAt": "2026-02-01T19:36:16",
    "departmentCode": "CS",
    "departmentId": 1,
    "departmentName": "Computer Science",
    "description": "Handles computer science and software programs",
    "updatedAt": "2026-02-01T19:36:16"
}

WHEN ID IS NOT PRESENT
404 Not Found

3.CREATE DEPT
{
    "createdAt": "2026-02-02T12:57:42.41128",
    "departmentCode": "BCA",
    "departmentId": 9,
    "departmentName": "Bachelor Of Computer Application",
    "description": "Handles computer science and software Application",
    "updatedAt": "2026-02-02T12:57:42.41128"
}

4.DELETE DEPT

204 No Content

5.UPDATED DEPT
{
    "createdAt": "2026-02-02T12:57:42",
    "departmentCode": "EEE",
    "departmentId": 9,
    "departmentName": "Electrical & Electronics Engineering",
    "description": "Handles Electrical and Electronics Systems",
    "updatedAt": "2026-02-02T13:16:36.2265739"
}
