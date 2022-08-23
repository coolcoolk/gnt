import React from 'react';
//testdata
import testtopicsdata from "../../testdb/topics.json"

export default function MarketBeforeBet() {
    const topicnum = 1
    const topicList = testtopicsdata.topics.filter(topic => (
        topic.id==topicnum
    ))
        console.log(testtopicsdata.topicList)
    return(
        <div>
            {topicList.map(topic => (
                <h1>MarketBeforeBet {topic.id}</h1>
            ))}
        </div>
    )
}