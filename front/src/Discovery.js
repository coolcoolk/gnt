import React from 'react';
import CountdownTimer from './Component/CountdownTimer/CountdownTimer';
import Percentagebar from './Component/Percentagebar/Percentagebar';

export default function Discovery() {
    return(
        <div className="container topic-box">
        <div className="topic-name">
        2022년 8월 4주차 윤석열 지지율 15% 이하
        </div>
        <div className="topic-tags">
          <div className="topic-tag-toggle">
            #정치
          </div>
          <div className="topic-tag-toggle">
            #대통령지지율
          </div>
          <div className="topic-tag-toggle">
            #윤석열
          </div>
        </div>
        <Percentagebar/>
        <CountdownTimer
        countdownTimestampMs={'2022-08-22 19:30:00'}/>
      </div>
    )
}