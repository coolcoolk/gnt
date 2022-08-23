import React, { Component, useEffect, useState } from 'react';
import axios from 'axios';
import CountdownTimer from '../../../Component/CountdownTimer/CountdownTimer';
import Percentagebar from '../../../Component/Percentagebar/Percentagebar';
import { Link } from 'react-router-dom';
//testdata
import testtopicsdata from "../../../testdb/topics.json"

export default function MarketDiscoveryTopicContainer() {

    // const [topicList, setTopicList] = useState(null);
    // const fetchData = async () => {
    //   const response = await axios.get('/topics')
    //     setTopicList(response.data);
    // };
    // useEffect(() => {
    //   fetchData();
    // },[])

    return(
        <div className="container each-topic">
        {testtopicsdata.topics.map((id) => (
          <div className= "container topic-box" key={id.id}>
            <div className="topic-name">{id.name}</div>
            <div className="topic-tags">
              <div className="topic-tag-toggle">{id.tags[0]}</div>
              <div className="topic-tag-toggle">{id.tags[1]}</div>
            </div>
            <Percentagebar/>
            <CountdownTimer countdownTimestampMs={id.created_timestamp}/>
            <div className='total-coins'>coin emoji{id.bet_info[0].coin+id.bet_info[1].coin}</div>
            <div className='total-participants'>people emoji{id.bet_info[0].participants+id.bet_info[1].participants}</div>
            <div>{id.rule_discription}</div>
          </div>
        ))}
        </div>

      //   {topicList && topicList.map((topic) => (
      //     <div key={topic.id}>
    )
  }