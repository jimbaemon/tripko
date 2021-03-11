import mocker from 'mocker-data-generator';

const comment = {
  comment_id: {
    chance: 'guid',
  },
  comment_parent_id: {
    chance: 'guid',
  },
  board_id: {
    chance: 'guid',
  },
  created_by: {
    chance: 'guid',
  },
  content: {
    faker: 'lorem.sentence',
  },
  created_at: {
    faker: 'date.past',
  },
  modified_at: {
    faker: 'date.past',
  },
  deleted_yn: {
    faker: 'random.boolean',
  },
  deleted_by: {
    chance: 'guid',
  },
  deleted_at: {
    faker: 'date.past',
  },
};

export const getComments = () =>
  // eslint-disable-next-line implicit-arrow-linebreak
  mocker()
    .schema('payload', comment, 100)
    .build((err, data) => data);
